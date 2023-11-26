package org.raul.domain.contracts;

import org.raul.domain.entities.QrCode;

public interface IQrCodeRepository {
    void add(QrCode qrCode, Integer transactionId, String emv);
}
