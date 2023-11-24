package org.apicellcoin.domain.repositories;

import org.apicellcoin.domain.entities.CelcoinPixBO;

public interface ICelcoinPixDataBaseRepository {
    CelcoinPixBO persist(CelcoinPixBO pixDTO);

}