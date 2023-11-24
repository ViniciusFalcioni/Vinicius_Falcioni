package com.fag.domain.repositories;

import com.fag.domain.entities.QrcodePixBO;

public interface IPixDatabaseRepository {

  QrcodePixBO persist(QrcodePixBO pixDTO);

}