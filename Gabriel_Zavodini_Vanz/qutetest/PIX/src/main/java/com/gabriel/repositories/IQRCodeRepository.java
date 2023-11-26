package com.gabriel.repositories;

public interface IQRCodeRepository {
  IQRCodeRepositoryResponse get(IQRCodeRepositoryRequest request);
}
