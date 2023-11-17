package br.com.fag.domain.usecases;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.domain.entities.RechargeBO;
import br.com.fag.domain.mappers.RechargeMapper;
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

  public RechargeDTO execute(RechargeDTO dto) {
    RechargeBO bo = RechargeMapper.toBO(dto);

    RechargeDTO rechargeResponse = vendor.create(dto);

    if (rechargeResponse.isSuccess()) {
      bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
    } else {
      bo.handleError();
    }

    databaseRepository.persist(bo);

    return rechargeResponse;
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
