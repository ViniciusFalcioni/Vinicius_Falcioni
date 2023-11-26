package org.fag.trab.domain.repositories;

import org.fag.trab.domain.entities.PixBo;

public interface IPixDbRepository {
    PixBo persist(PixBo bo);
}
