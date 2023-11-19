package com.fag.infra.mercadopago.repository;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MpPixRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClientMp restClient;

    @Override
    public PixDTO create(PixDTO dto) {
        // Lógica da request para o MP
        String token = "";

        return null;
    }

}
