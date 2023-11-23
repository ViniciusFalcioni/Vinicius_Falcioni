package org.fag.trab.domain.repositories;

import org.fag.trab.domain.dto.PixDto;

public interface IPixRepository {
    PixDto generate(PixDto dto);
}
