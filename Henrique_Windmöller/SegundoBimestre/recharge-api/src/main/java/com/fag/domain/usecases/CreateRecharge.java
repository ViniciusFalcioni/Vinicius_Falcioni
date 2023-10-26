package main.java.com.fag.domain.usecases;

import domain.dto.RechargeDTO;
import domain.repositories.IRechargeDataBaseRepository;
import domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendor vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO recharge) {
        
    }
}

