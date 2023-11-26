package infra.panache.repositories;

import domain.entities.RechargeBO;
import domain.repositories.IRechargeDataBaseRepository;
import infra.panache.mappers.PanacheRechargeMapper;
import infra.panache.model.PanacheRecharge;
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
