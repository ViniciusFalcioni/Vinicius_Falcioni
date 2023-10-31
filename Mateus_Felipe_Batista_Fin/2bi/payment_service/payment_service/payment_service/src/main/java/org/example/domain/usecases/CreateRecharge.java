package org.example.domain.usecases;

import org.example.domain.dto.RechargeDTO;
import org.example.domain.repositories.IRechargeDataBaseRepository;
import org.example.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;
    private IRechargeDataBaseRepository dbRepository;

    public RechargeDTO execute (RechargeDTO rechargeDTO) {
        return null;
    }

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }
}
