package org.api.celcoin.domain.repositories;

import org.api.celcoin.domain.dto.PixDTO;

public interface IPixVendorRepository {
    PixDTO create(PixDTO pix);
}
