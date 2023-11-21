package org.diego.domain.contracts;

import org.diego.domain.entities.QrCode;

public interface IQrCodeProvider {
    String provide(QrCode qrCode);
}
