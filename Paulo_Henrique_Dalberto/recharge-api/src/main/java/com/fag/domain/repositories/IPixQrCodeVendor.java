package com.fag.domain.repositories;

import com.fag.domain.dto.PixQrCodeDTO;

public interface IPixQrCodeVendor {

  PixQrCodeDTO create(PixQrCodeDTO pix);
}