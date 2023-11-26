package com.fag.gabriel.repositories.contracts;

import com.fag.gabriel.domain.usecases.ICreatePixReq;

public interface IGenPixRepo {
  IGenPixRepoResponse gen(ICreatePixReq pix);
}
