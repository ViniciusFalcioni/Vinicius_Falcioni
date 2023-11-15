package main.java.com.fag.infra.panache.repository;

import main.java.com.fag.domain.repositories.IRechargeDataBaseRepository;
import main.java.com.fag.infra.panache.mappers.PanacheRechargeMapper;

@ApplicattionScoped
public class PanacheDataBaseRepositoy implements IRechargeDataBaseRepository {
    
    @Override
    public RechargeBO pessist(RechargeBO bo){
        PanacehRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }
}
