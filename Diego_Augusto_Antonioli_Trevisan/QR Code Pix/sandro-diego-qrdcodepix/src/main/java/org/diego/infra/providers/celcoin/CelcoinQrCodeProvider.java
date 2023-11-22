package org.diego.infra.providers.celcoin;

import org.diego.domain.contracts.IQrCodeProvider;
import org.diego.domain.entities.QrCode;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;

public class CelcoinQrCodeProvider implements IQrCodeProvider {

    @Inject
    @RestClient
    private CelcoinRestClient celcoin;

    @Override
    public String provide(QrCode qrCode) {
        return "";

    }

}
