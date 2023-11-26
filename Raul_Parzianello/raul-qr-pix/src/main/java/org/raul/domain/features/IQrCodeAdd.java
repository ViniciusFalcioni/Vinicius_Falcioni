package org.raul.domain.features;

import org.raul.domain.contracts.QrCodeResponse;
import org.raul.domain.entities.QrCode;

public interface IQrCodeAdd {

    public QrCodeResponse execute(QrCode qrCode);
}
