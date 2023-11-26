package org.bortoli.domain.repositories;

import org.bortoli.domain.dto.PixQrCodeDTO;

public interface IPixRepository {
    PixQrCodeDTO create(PixQrCodeDTO dto);
}
