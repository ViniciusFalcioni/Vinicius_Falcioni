package com.github.faening.domain.usecases;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.domain.entities.PixQrCodeBO;
import com.github.faening.domain.mappers.PixQrCodeMapper;
import com.github.faening.domain.repositories.IPixPersistRepository;
import com.github.faening.domain.repositories.IPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CreatePixQrCodeUC {
    private IPixRepository pixRepository;
    private IPixPersistRepository persistRepository;

    public CreatePixQrCodeUC(IPixRepository pixRepository, IPixPersistRepository persistRepository) {
        this.pixRepository = pixRepository;
        this.persistRepository = persistRepository;
    }

    public PixQrCodeDTO execute(PixQrCodeDTO pixQrCodeDTO) {
        // Cria o Pix QR Code a partir do respositório
        PixQrCodeDTO createdPix = pixRepository.create(pixQrCodeDTO);

        // Mapeia o PixQrCodeDTO para PixQrCodeBO
        PixQrCodeBO pixQrCodeBO = PixQrCodeMapper.toBO(createdPix);

        // Salvar o PixQrCodeBO no banco de dados
        this.persistRepository.persist(pixQrCodeBO);

        // Retorna o Pix QR Code
        return createdPix;
    }
}
