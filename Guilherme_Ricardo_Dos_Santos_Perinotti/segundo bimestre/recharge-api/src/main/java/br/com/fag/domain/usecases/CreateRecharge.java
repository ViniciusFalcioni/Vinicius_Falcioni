package br.com.fag.domain.usecases;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.domain.repositories.IRechargeDatabaseRepository;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
  private IRechargeVendorRepository vendor;
  private IRechargeDatabaseRepository databaseRepository;

  public CreateRecharge() {
  }

  public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDatabaseRepository databaseRepository) {
    this.vendor = vendor;
    this.databaseRepository = databaseRepository;
  }

  public RechargeDTO execute(RechargeDTO recharge) {
    return null;
  }

  public IRechargeVendorRepository getVendor() {
    return this.vendor;
  }

  public void setVendor(IRechargeVendorRepository vendor) {
    this.vendor = vendor;
  }

  public IRechargeDatabaseRepository getDatabaseRepository() {
    return this.databaseRepository;
  }

  public void setDatabaseRepository(IRechargeDatabaseRepository databaseRepository) {
    this.databaseRepository = databaseRepository;
  }

}
