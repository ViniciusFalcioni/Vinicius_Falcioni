package org.walker.tech.pix.service;

import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.infra.celcoin.repositories.PixCelcoinRepository;
import org.walker.tech.pix.infra.panache.PanacheDbRepository;
import org.walker.tech.pix.infra.usecasesses.GeneratePixUseCase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {

    private final PanacheDbRepository panacheDbRepository;
    private final GeneratePixUseCase generatePixUseCase;

    @Inject
    public PixService(PixCelcoinRepository pixCelcoinRepository, PanacheDbRepository panacheDbRepository, GeneratePixUseCase generatePixUseCase) {
        this.panacheDbRepository = panacheDbRepository;
        this.generatePixUseCase = generatePixUseCase;
    }

    public PixDto generatePix(PixDto dto) {
        PixDto generatedPix = generatePixUseCase.generate(dto);

        if (generatedPix != null) {
            panacheDbRepository.persist(generatedPix);
        }

        return generatedPix;
    }
}
