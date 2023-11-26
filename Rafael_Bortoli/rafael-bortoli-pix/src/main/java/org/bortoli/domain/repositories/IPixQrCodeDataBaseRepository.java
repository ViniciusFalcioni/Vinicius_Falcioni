package org.bortoli.domain.repositories;

import org.bortoli.domain.entities.PixQrCodeBO;

public interface IPixQrCodeDataBaseRepository {
    PixQrCodeBO persist(PixQrCodeBO bo);
}
