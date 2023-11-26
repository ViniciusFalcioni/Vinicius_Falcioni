package org.example.domain.repositories;

import org.example.domain.entities.PixBO;

public interface IPixDataBaseRepository {
    PixBO persist(PixBO pix);
}
