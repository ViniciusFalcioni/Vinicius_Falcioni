package main.java.com.fag.domain.usecases;

import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.domain.entities.RechargeBO;
import main.java.com.fag.domain.mappers.RechargeMapper;
import main.java.com.fag.domain.repositories.IRechargeDataBaseRepository;
import main.java.com.fag.domain.repositories.IRechargeVendorRepository;
import main.java.com.fag.infra.celcoin.repository.RechargeCelcoin;

public class CreateRecharge {
    private final IRechargeVendorRepository vendor;
    private final IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(RechargeCelcoin celcoin, IRechargeDataBaseRepository dbRepository) {
        this.vendor = (IRechargeVendorRepository) celcoin;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO rechargeDTO) {
        // Realize a lógica de criação da recarga usando o vendor
        RechargeDTO createdRecharge = vendor.create(rechargeDTO);

        // Salve a recarga no banco de dados
        RechargeBO rechargeBO = RechargeMapper.toBO(createdRecharge);
        RechargeBO persistedRechargeBO = dbRepository.persist(rechargeBO);

        // Retorne a recarga criada
        return RechargeMapper.toDTO(persistedRechargeBO);
    }
}