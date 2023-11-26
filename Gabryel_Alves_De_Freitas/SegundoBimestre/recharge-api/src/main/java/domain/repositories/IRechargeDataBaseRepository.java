package domain.repositories;

import domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
     RechargeBO persist(RechargeBO rechargeBO);
}
