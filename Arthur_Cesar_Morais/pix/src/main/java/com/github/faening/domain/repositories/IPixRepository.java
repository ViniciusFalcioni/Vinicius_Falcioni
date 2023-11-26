package com.github.faening.domain.repositories;

import com.github.faening.domain.dto.PixQrCodeDTO;

public interface IPixRepository {
    PixQrCodeDTO create(PixQrCodeDTO pixQrCodeDTO);
}
