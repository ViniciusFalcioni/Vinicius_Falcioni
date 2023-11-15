package main.java.com.fag.domain.repositories;


import domain.entities.RechargeBO;

public interface IRechargeVendor {
    RechargeBO persist(RechargeBO bo);
}
