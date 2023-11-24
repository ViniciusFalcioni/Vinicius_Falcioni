package main.java.org.example.domain.usecases;


import main.java.org.example.domain.dto.RechargeDTO;
import main.java.org.example.domain.repositories.IRechargeDataBaseRepository;
import main.java.org.example.domain.repositories.IRechargeVendor;

public class CreateRecharge {
    private IRechargeVendor vendor;
    private IRechargeDataBaseRepository dbRepository;

    public RechargeDTO execute (RechargeDTO rechargeDTO) {
        return null;
    }

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }
}
