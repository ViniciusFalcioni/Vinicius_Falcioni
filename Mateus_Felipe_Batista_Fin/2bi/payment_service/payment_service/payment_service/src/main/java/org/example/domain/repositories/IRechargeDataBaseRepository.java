package org.example.domain.repositories;

import org.example.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist (RechargeBO bo);
}
