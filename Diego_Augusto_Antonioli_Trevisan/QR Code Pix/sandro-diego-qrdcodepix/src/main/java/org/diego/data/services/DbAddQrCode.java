package org.diego.data.services;

import org.diego.domain.contracts.AddQrCodeResponse;
import org.diego.domain.contracts.IAddQrCodeRepo;
import org.diego.domain.contracts.IQrCodeProvider;
import org.diego.domain.contracts.IQrCodeTransformer;
import org.diego.domain.entities.QrCode;
import org.diego.domain.features.IAddQrCode;

public class DbAddQrCode implements IAddQrCode {
    private IQrCodeTransformer qrCodeTransformer;

    private IQrCodeProvider qrCodeProvider;

    private IAddQrCodeRepo addQrCodeRepo;

    public DbAddQrCode(IQrCodeTransformer qrCodeTransformer, IQrCodeProvider qrCodeProvider,
            IAddQrCodeRepo addQrCodeRepo) {
        this.qrCodeTransformer = qrCodeTransformer;
        this.qrCodeProvider = qrCodeProvider;
        this.addQrCodeRepo = addQrCodeRepo;
    }

    @Override
    public AddQrCodeResponse execute(QrCode qrCode) {
        String qrCodeProvided = this.qrCodeProvider.provide(qrCode);
        this.addQrCodeRepo.add(qrCode);
        String base64QrCode = this.qrCodeTransformer.transform(qrCodeProvided);
        return new AddQrCodeResponse(base64QrCode, qrCode.getAmount());
    }

}
