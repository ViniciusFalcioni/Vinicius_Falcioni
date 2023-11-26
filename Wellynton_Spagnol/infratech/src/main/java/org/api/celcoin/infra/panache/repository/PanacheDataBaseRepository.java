package org.api.celcoin.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.api.celcoin.domain.entities.RechargeBO;
import org.api.celcoin.domain.repositories.IRechargeDataBaseRepository;
import org.api.celcoin.infra.panache.mappers.PanacheRechargeMapper;
import org.api.celcoin.infra.panache.model.PanacheRecharge;

;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {

    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }

}
