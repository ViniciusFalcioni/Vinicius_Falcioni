package com.fag.repository;

import com.fag.model.Equacao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EquacaoRepository implements PanacheRepository<Equacao> {
}
