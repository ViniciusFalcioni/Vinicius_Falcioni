package com.pedro.repositories;

import com.pedro.domain.usecases.ICreateQRCodePixRequest;

public class IQRCodeRepositoryRequest extends ICreateQRCodePixRequest {

  public IQRCodeRepositoryRequest(String key, Double amount) {
    super(key, amount);
  }
}
