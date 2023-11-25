package org.fag.domain.repositories;

import org.fag.domain.entities.PixBO;

public interface IPixDataBaseRepository {

    PixBO persist (PixBO pixDTO);
    
}
