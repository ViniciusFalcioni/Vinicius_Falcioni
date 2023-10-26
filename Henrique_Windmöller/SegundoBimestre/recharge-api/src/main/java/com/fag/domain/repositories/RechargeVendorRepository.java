package main.java.com.fag.domain.repositories;


import domain.entities.RechargeBO;

public interface IRechargeVendorRepository {
    RechargeBO persist(RechargeBO bo);
}
