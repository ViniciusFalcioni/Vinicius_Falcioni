package org.diego.domain.contracts;

import org.diego.domain.entities.QrCode;

public interface IAddQrCodeRepo {
    void add(QrCode qrCode);
}
