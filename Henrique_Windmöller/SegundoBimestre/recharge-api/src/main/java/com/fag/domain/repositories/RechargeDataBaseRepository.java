package main.java.com.fag.domain.repositories;

import domain.dto.OperatorDTO;
import domain.dto.ProductDTO;
import domain.entities.PhoneBO;
import domain.entities.ProductBO;

import java.util.List;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}

