package main.java.org.example.domain.repositories;


import main.java.org.example.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist (RechargeBO bo);
}
