package com.fag.Infra.Panache.Repository;

import com.fag.Domain.Entities.RechargeBO;
import com.fag.Domain.Repositories.IRechargeDataBaseRepository;
import com.fag.Infra.Panache.Mappers.PanacheRechargeMapper;
import com.fag.Infra.Panache.Model.PanacheRecharge;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {

    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }
}