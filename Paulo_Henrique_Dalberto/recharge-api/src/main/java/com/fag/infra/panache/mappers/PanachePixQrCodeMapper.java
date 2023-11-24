package com.fag.infra.panache.mappers;

import com.fag.domain.entities.PixQrcodeBO;
import com.fag.infra.panache.model.PanachePixQrCode;

public class PanachePixQrCodeMapper {
  public static PixQrcodeBO toDomain(PanachePixQrCode entity) {

    return new PixQrcodeBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());

  }

  public static PanachePixQrCode toEntity(PixQrcodeBO bo) {
    PanachePixQrCode entity = new PanachePixQrCode();

    entity.setId(bo.getId());
    entity.setKey(bo.getKey());
    entity.setTransactionId(bo.getTransactionId());
    entity.setEmvqrcps(bo.getQrCode());
    entity.setAmount(bo.getAmount());

    return entity;
  }
}
