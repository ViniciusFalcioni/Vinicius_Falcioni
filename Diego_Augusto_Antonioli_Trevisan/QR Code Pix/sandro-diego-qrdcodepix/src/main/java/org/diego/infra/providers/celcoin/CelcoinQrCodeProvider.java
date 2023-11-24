package org.diego.infra.providers.celcoin;

import java.util.List;

import org.diego.domain.contracts.IQrCodeProvider;
import org.diego.domain.contracts.QrCodeProviderResponse;
import org.diego.domain.entities.QrCode;
import org.diego.infra.providers.celcoin.token.CelcoinTokenRequest;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;

public class CelcoinQrCodeProvider implements IQrCodeProvider {

    @Inject
    @RestClient
    private CelcoinRestClient celcoin;

    @Override
    public QrCodeProviderResponse provide(QrCode qrCode) {
        CelcoinRequest dto = new CelcoinRequest(qrCode.getKey(), qrCode.getAmount(), "testqrcodestaticcelcoin",
                qrCode.getMerchant(), List.of(""), "Teste Geração QR Code", false);
        String token = celcoin.getCelcoinToken(new CelcoinTokenRequest()).getAccessToken();

        var response = celcoin.generateQrCode(dto, token);

        return new QrCodeProviderResponse(response.getEmvqrcps(), response.getTransactionId());

    }

}
