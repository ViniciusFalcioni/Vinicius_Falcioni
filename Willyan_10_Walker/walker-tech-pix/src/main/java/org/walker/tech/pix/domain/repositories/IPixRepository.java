package org.walker.tech.pix.domain.repositories;

import org.walker.tech.pix.domain.dto.PixDto;

public interface IPixRepository {
    PixDto generate(PixDto dto);
}
