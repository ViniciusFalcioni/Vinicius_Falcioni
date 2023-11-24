package com.pedro.repositories;

public interface IQRCodeRepository {
  IQRCodeRepositoryResponse get(IQRCodeRepositoryRequest request);
}
