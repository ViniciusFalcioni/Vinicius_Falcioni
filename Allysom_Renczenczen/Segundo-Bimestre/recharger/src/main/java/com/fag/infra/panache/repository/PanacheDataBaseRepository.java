package com.fag.infra.panache.repository;

import com.fag.domain.entities.RechargeBO;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendor;
import com.fag.domain.useCases.CreateRecharge;
import com.fag.domain.useCases.ListOperators;
import com.fag.domain.useCases.ListProducts;
import com.fag.infra.panache.mappers.PanacheRechargeMapper;
import com.fag.infra.panache.models.PanacheRecharge;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {
    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanacheRechargeMapper.toDomain(entity);
    }

    @Override
    public CreateRecharge creacteReacharge(IRechargeVendor vendor, IRechargeDataBaseRepository dataBaseRepository) {
        return new CreateRecharge(vendor, dataBaseRepository);
    }

    @Override
    public ListOperators listOperators(IRechargeVendor vendor) {
        return new ListOperators(vendor);
    }
    @Override
    public ListProducts listProducts(IRechargeVendor vendor) {
        return new ListProducts(vendor);
    }
}
