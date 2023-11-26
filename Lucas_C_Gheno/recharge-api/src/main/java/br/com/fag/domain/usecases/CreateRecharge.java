package br.com.fag.domain.usecases;

import br.com.fag.domain.dto.CCoinRechargeDTO;
import br.com.fag.domain.repositories.IRechargeDatabaseRepository;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;
    private IRechargeDatabaseRepository databaseRepository;

    public CreateRecharge() {
    }

    public CCoinRechargeDTO execute(CCoinRechargeDTO recharge) {
        return null;
    }

}