package org.raul.domain.contracts;

import org.raul.domain.entities.QrCode;

public interface IQrCodeProvider {
    QrCodeProviderResponse provide(QrCode qrCode);
}
