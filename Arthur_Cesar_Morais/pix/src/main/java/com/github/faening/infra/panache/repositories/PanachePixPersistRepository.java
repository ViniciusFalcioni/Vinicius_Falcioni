package com.github.faening.infra.panache.repositories;

import com.github.faening.domain.entities.PixQrCodeBO;
import com.github.faening.domain.repositories.IPixPersistRepository;
import com.github.faening.infra.panache.mappers.PanachePixQrCodeMapper;
import com.github.faening.infra.panache.model.PanachePixQrCodeModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanachePixPersistRepository implements IPixPersistRepository {
    @Override
    @Transactional
    public PixQrCodeBO persist(PixQrCodeBO pixQrCodeBO) {
        // Mapeia o PixQrCodeBO para PanachePixQrCodeModel
        PanachePixQrCodeModel panachePixQrCodeModel = PanachePixQrCodeMapper.toModel(pixQrCodeBO);


        // Salva o objeto PanachePixQrCodeModel no banco de dados
        panachePixQrCodeModel.persistAndFlush();

        // Retorna o objeto salvo
        return PanachePixQrCodeMapper.toBO(panachePixQrCodeModel);
    }
}
