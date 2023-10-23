package com.fag.Domain.Repositories;

import com.fag.Domain.Entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
