package com.fag.domain.interfaces;

/**
 * A interface IMapper é responsável por definir os métodos para realizar a conversão
 * entre um DTO (Data Transfer Object) e um BO (Business Object).
 *
 * @param <DTO> O tipo de objeto DTO que será mapeado.
 * @param <BO> O tipo de objeto BO resultante após o mapeamento.
 */
public interface IMapper<DTO, BO> {

    /**
     * Realiza o mapeamento de um objeto DTO para um objeto BO.
     *
     * @param dto O objeto DTO a ser mapeado para um objeto BO.
     * @return O objeto BO resultante após o mapeamento.
     */
    BO toBO(DTO dto);

    /**
     * Realiza o mapeamento de um objeto BO para um objeto DTO.
     *
     * @param entity O objeto BO a ser mapeado para um objeto DTO.
     * @return O objeto DTO resultante após o mapeamento.
     */
    DTO toDTO(BO entity);

}
