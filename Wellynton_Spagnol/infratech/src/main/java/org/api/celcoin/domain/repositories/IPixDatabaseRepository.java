package org.api.celcoin.domain.repositories;

import org.api.celcoin.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO pixDTO);
}
