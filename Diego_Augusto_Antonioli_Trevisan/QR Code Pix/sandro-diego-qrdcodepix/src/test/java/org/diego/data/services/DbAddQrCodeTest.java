package org.diego.data.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.diego.domain.contracts.AddQrCodeResponse;
import org.diego.domain.contracts.IAddQrCodeRepo;
import org.diego.domain.contracts.IQrCodeProvider;
import org.diego.domain.contracts.IQrCodeTransformer;
import org.diego.domain.entities.Merchant;
import org.diego.domain.entities.QrCode;
import org.diego.domain.features.IAddQrCode;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.enterprise.context.ApplicationScoped;

@QuarkusTest
public class DbAddQrCodeTest {

    private QrCodeTransformerMock qrCodeTransformer = new QrCodeTransformerMock();

    private IQrCodeProvider qrCodeProvider = new QrCodeProviderMock();

    private IAddQrCodeRepo addQrCodeRepo = new AddQrCodeRepoMock();

    private IAddQrCode sut = new DbAddQrCode(qrCodeTransformer, qrCodeProvider, addQrCodeRepo);

    private static String qrCodeTransformerResponse = "valid-one";
    private static String qrCodeProviderResponse = "valid-one";

    @Test
    void theUserProvidedValidParams_thenAddQrCodeResponseShouldBeReturned() {
        Merchant fakeMerchant = new Merchant();
        QrCode fakeData = new QrCode(fakeMerchant, 2.0, "valid-one", "valid-base64");
        AddQrCodeResponse response = sut.execute(fakeData);
        AddQrCodeResponse expectedResponse = new AddQrCodeResponse(qrCodeTransformerResponse, fakeData.getAmount());

        assertEquals(response.getAmount(), expectedResponse.getAmount());
        assertEquals(response.getBase64(), expectedResponse.getBase64());
    }

    @ApplicationScoped
    public static class QrCodeTransformerMock implements IQrCodeTransformer {

        @Override
        public String transform(String emv) {
            return qrCodeTransformerResponse;
        }

    }

    @ApplicationScoped
    public static class QrCodeProviderMock implements IQrCodeProvider {

        @Override
        public String provide(QrCode qrCode) {
            return qrCodeProviderResponse;
        }

    }

    @ApplicationScoped
    public static class AddQrCodeRepoMock implements IAddQrCodeRepo {

        @Override
        public void add(QrCode qrCode) {
        }

    }
}
