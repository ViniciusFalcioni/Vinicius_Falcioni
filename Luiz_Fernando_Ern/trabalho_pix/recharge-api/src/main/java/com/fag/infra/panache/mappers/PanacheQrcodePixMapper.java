package com.fag.infra.panache.mappers;

import com.fag.domain.entities.QrcodePixBO;
import com.fag.infra.panache.model.PanacheQrcodePix;

public class PanacheQrcodePixMapper {
  public static QrcodePixBO toDomain(PanacheQrcodePix entity) {

    return new QrcodePixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId(), entity.getAdditionalInformation());
  }

  public static PanacheQrcodePix toEntity(QrcodePixBO bo) {
    PanacheQrcodePix entity = new PanacheQrcodePix();
    entity.setId(bo.getId());
    entity.setKey(bo.getKey());
    entity.setTransactionId(bo.getTransactionId());
    entity.setEmvqrcps(bo.getQrCode());
    entity.setAmount(bo.getAmount());
    entity.setAdditionalInformation(bo.getAdditionalInformation());

    return entity;
  }
}
