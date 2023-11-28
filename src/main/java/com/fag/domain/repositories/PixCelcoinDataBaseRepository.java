package com.fag.domain.repositories;

import com.fag.domain.entities.PixCelcoinBO;

public interface PixCelcoinDataBaseRepository {
    PixCelcoinBO persist(PixCelcoinBO pixDTO);
}
