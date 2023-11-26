package com.fag.domain.repositories;

import com.fag.domain.entities.PixQrcodeBO;

public interface IPixQrCodeDataBaseRepository {
  
  PixQrcodeBO persist(PixQrcodeBO pixDTO);
}