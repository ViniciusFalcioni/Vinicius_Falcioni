package org.raul.infra.providers.celcoin;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.raul.domain.contracts.IQrCodeProvider;
import org.raul.domain.contracts.QrCodeProviderResponse;
import org.raul.domain.entities.QrCode;
import org.raul.infra.providers.celcoin.token.TokenRequest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class QrCodeProvider implements IQrCodeProvider {

    @Inject
    @RestClient
    private CelcoinRestClient celcoin;

    @Override
    public QrCodeProviderResponse provide(QrCode qrCode) {
        CelcoinRequest dto = new CelcoinRequest(qrCode.getKey(), qrCode.getAmount(), "testqrcodestaticcelcoin",
                qrCode.getMerchant(), List.of(""), "Teste Geração QR Code", false);

        String token = celcoin.getCelcoinToken(new TokenRequest()).getAccessToken();

        var response = celcoin.generateQrCode(dto, token);

        return new QrCodeProviderResponse(response.getEmvqrcps(), response.getTransactionId());

    }

}
