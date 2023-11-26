package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.CCoinOperatorDTO;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListOperators {
    private IRechargeVendorRepository vendor;

    public ListOperators() {
    }

    public List<CCoinOperatorDTO> execute(){
        return null;
    }
}