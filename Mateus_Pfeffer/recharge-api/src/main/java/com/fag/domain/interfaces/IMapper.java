package com.fag.domain.interfaces;

public interface IMapper<DTO, BO> {

    BO toBO(DTO dto);

    DTO toDTO(BO entity);

}
