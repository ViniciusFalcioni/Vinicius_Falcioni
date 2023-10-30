package com.fag.domain.repositories;

import com.fag.domain.entities.RechargeBO;
import com.fag.domain.useCases.CreateRecharge;
import com.fag.domain.useCases.ListOperators;
import com.fag.domain.useCases.ListProducts;

import java.util.List;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
    CreateRecharge creacteReacharge(IRechargeVendor vendor, IRechargeDataBaseRepository dataBaseRepository);
    ListOperators listOperators(IRechargeVendor vendor);
    ListProducts listProducts(IRechargeVendor vendor);
}
