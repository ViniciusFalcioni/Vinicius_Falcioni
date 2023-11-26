package org.example.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.domain.entities.RechargeBO;
import org.example.domain.repositories.IRechargeDataBaseRepository;
import org.example.infra.panache.mappers.PanacheRechargeMapper;
import org.example.infra.panache.model.PanacheRecharge;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {

    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }
}
