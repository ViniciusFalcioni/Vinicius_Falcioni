package br.com.fag.infra.panache;

import br.com.fag.domain.entities.RechargeBO;
import br.com.fag.domain.repositories.IRechargeDataBaseRepository;
import br.com.fag.infra.panache.mappers.PanacheRechargeMapper;
import br.com.fag.infra.panache.model.PanacheRecharge;

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
