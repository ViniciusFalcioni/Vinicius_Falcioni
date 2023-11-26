package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.CCoinProductDTO;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class ProductsList {
    private IRechargeVendorRepository vendor;

    public ProductsList() {
    }

    public List<CCoinProductDTO> execute(Integer operatorId) {
        return null;
    }

}