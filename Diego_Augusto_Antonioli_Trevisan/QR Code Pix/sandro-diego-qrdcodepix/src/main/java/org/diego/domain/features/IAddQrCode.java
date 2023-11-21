package org.diego.domain.features;

import org.diego.domain.contracts.AddQrCodeResponse;
import org.diego.domain.entities.QrCode;

public interface IAddQrCode {

    public AddQrCodeResponse execute(QrCode qrCode);
}
