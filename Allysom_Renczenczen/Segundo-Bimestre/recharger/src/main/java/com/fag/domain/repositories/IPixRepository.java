package com.fag.domain.repositories;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;

public interface IPixRepository {

    PixBO persist(PixBO bo);
}
