package org.raul.data.services;

import org.raul.domain.contracts.QrCodeResponse;
import org.raul.domain.contracts.IQrCodeRepository;
import org.raul.domain.contracts.IQrCodeProvider;
import org.raul.domain.contracts.IQrCodeTransform;
import org.raul.domain.contracts.QrCodeProviderResponse;
import org.raul.domain.entities.QrCode;
import org.raul.domain.features.IQrCodeAdd;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GenerateQrCode implements IQrCodeAdd {
    private IQrCodeTransform qrCodeTransformer;

    private IQrCodeProvider qrCodeProvider;

    private IQrCodeRepository addQrCodeRepo;

    public GenerateQrCode(IQrCodeTransform qrCodeTransformer, IQrCodeProvider qrCodeProvider,
            IQrCodeRepository addQrCodeRepo) {
        this.qrCodeTransformer = qrCodeTransformer;
        this.qrCodeProvider = qrCodeProvider;
        this.addQrCodeRepo = addQrCodeRepo;
    }

    @Override
    public QrCodeResponse execute(QrCode qrCode) {
        QrCodeProviderResponse qrCodeProvided = this.qrCodeProvider.provide(qrCode);
        this.addQrCodeRepo.add(qrCode, qrCodeProvided.getTransactionId(), qrCodeProvided.getResponse());
        String base64QrCode = this.qrCodeTransformer.transform(qrCodeProvided.getResponse());
        return new QrCodeResponse(base64QrCode, qrCode.getAmount());
    }

}
