package br.com.fag.domain.repositories;

import br.com.fag.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {

  RechargeBO persist(RechargeBO bo);

}
