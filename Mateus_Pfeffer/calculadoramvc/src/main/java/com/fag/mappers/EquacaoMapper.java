package com.fag.mappers;

import com.fag.dto.EquacaoDTO;
import com.fag.model.Equacao;

public class EquacaoMapper {

    public static Equacao toEntity(EquacaoDTO dto) {
        Equacao entity = new Equacao();

        entity.setValue1(dto.value1());
        entity.setValue2(dto.value2());
        entity.setOperation(dto.operation());
        entity.setResult(dto.result());

        return entity;
    }

    public static EquacaoDTO toDTO(Equacao entity) {
        return new EquacaoDTO(
                entity.getValue1(), entity.getValue2(), entity.getOperation(), entity.getResult()
        );
    }

}
