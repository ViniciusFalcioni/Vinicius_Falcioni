package com.github.faening.domain.repositories;

import com.github.faening.domain.entities.PixQrCodeBO;

public interface IPixPersistRepository {
    PixQrCodeBO persist(PixQrCodeBO pixQrCodeBO);
}
