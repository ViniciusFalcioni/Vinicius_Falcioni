package org.fag.trab.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.domain.usecases.GeneratePixUseCase;
import org.fag.trab.infra.celcoin.repositories.PixCelcoinRepository;
import org.fag.trab.infra.panache.PanacheDbRepository;

@ApplicationScoped
public class PixService {
    @Inject
    PixCelcoinRepository repository;
    @Inject
    PanacheDbRepository dbRepository;

    public PixDto generatePix(PixDto dto) {
        GeneratePixUseCase generatePixUseCase = new GeneratePixUseCase(repository, dbRepository);
        return generatePixUseCase.generate(dto);
    }
}
