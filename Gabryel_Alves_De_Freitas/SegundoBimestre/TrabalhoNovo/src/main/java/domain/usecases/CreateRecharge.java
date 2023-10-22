package domain.usecases;

import domain.dto.RechargeDTO;
import domain.repositories.IRechargeDataBaseRepository;
import domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }   

    public RechargeDTO execute(RechargeDTO rechargeDTO) {
        RechargeDTO createdRecharge = vendor.create(rechargeDTO);
        return createdRecharge;
    }
}