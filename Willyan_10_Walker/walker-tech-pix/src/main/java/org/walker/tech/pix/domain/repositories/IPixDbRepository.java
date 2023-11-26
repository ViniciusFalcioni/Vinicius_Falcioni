package org.walker.tech.pix.domain.repositories;

import org.walker.tech.pix.domain.entities.PixBo;

public interface IPixDbRepository {
    PixBo persist(PixBo bo);
}
