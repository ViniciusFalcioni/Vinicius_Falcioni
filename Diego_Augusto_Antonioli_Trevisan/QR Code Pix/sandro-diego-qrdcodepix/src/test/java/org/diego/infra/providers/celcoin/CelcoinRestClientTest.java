package org.diego.infra.providers.celcoin;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.diego.domain.entities.Merchant;
import org.diego.infra.providers.celcoin.token.CelcoinTokenRequest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.reactive.ClientWebApplicationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class CelcoinRestClientTest {

    @Inject
    @RestClient
    private CelcoinRestClient sut;

    @Test
    @DisplayName("should returns Celcoin's access token")
    void getToken() {
        var fakeData = new CelcoinTokenRequest();
        var response = sut.getCelcoinToken(fakeData);
        assertNotNull(response);
    }

    @Test
    @DisplayName("should catch exception when we get token if we pass invalid params to Celcoin")
    void getException() {
        Assertions.assertThrows(ClientWebApplicationException.class, () -> {
            sut.getCelcoinToken(null);
        });
    }

    @Test
    @DisplayName("should returns Celcoin's Qr Code")
    void getQrCode() throws JsonProcessingException {
        var token = sut.getCelcoinToken(new CelcoinTokenRequest());
        var fakeData = new CelcoinRequest("testepix@celcoin.com.br", 10.22, "testqrcodestaticcelcoin",
                new Merchant(), List.of("String"), "Aboba", false);
        System.out.println(new ObjectMapper().writeValueAsString(fakeData));
        var response = sut.generateQrCode(fakeData, token.getAccessToken());

        assertNotNull(response);

    }

    @Test
    @DisplayName("should catches Celcoin's Qr Code exception")
    void getQrCodeException() throws JsonProcessingException {
        Assertions.assertThrows(ClientWebApplicationException.class, () -> {
            var token = sut.getCelcoinToken(new CelcoinTokenRequest());
            var fakeData = new CelcoinRequest("testepix@celcoin.com.br", 10.2, "testqrcodestaticcelcoin",
                    new Merchant(), List.of("String"), "Aboba", false);

            sut.generateQrCode(fakeData, token.getAccessToken());
        });

    }

}
