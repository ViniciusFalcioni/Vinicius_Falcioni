package br.com.fag.domain.usecases;


import br.com.fag.domain.dto.CCoinPixDTO;
import br.com.fag.domain.entities.PixBO;
import br.com.fag.domain.mappers.PixMapper;
import br.com.fag.domain.repositories.IRechargeDatabaseRepository;
import br.com.fag.domain.repositories.IRechargeVendorRepository;


public class CreatePixQRCode {

    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public CreatePixQRCode(IPixVendorRepository vendor, IPixDatabaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = vendor.create(dto);

        repository.persist(bo);

        return response;
    }


}
