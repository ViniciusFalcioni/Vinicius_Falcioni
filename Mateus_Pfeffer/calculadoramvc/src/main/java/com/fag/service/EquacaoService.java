package com.fag.service;

import com.fag.dto.EquacaoDTO;
import com.fag.mappers.EquacaoMapper;
import com.fag.model.Equacao;
import com.fag.repository.EquacaoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EquacaoService {

    @Inject
    EquacaoRepository repository;

    public Equacao createEquacao(EquacaoDTO dto) {
        Equacao newEquacao = EquacaoMapper.toEntity(dto);

        this.save(newEquacao);

        return newEquacao;
    }

    @Transactional
    public void save(Equacao equacao) {
        this.repository.persist(equacao);
    }

}
