package br.com.fag.domain.usecases;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.domain.repositories.IRechargeDatabaseRepository;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
  private IRechargeVendorRepository vendor;
  private IRechargeDatabaseRepository databaseRepository;

  public CreateRecharge() {
  }

  public RechargeDTO execute(RechargeDTO recharge) {
    return null;
  }

}
