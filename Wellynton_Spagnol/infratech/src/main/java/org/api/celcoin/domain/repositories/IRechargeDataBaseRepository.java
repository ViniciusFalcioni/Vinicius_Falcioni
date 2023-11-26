package org.api.celcoin.domain.repositories;

import org.api.celcoin.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
