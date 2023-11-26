package com.gabriel.repositories;

import com.gabriel.domain.usecases.ICreateQRCodePixServiceRequest;

public class IQRCodeRepositoryRequest extends ICreateQRCodePixServiceRequest {

  public IQRCodeRepositoryRequest(String key, Double amount) {
    super(key, amount);
  }
}
