package com.fag.domain.interfaces;

/**
 * A interface IMapper é responsável por definir os métodos para realizar a
 * conversão entre um DTO (Data Transfer Object) e um BO (Business Object).
 *
 * @param <DTO> O tipo de objeto DTO que será mapeado e retornado, de acordo
 *              com o método executado.
 * @param <BO>  O tipo de objeto BO que será mapeado e retornado, de acordo
 *              com o método executado.
 */
public interface IMapper<DTO, BO> {

    /**
     * Realiza o mapeamento de um DTO para um BO.
     *
     * @param dto O objeto DTO a ser mapeado para um objeto BO.
     * @return O objeto BO correspondente ao DTO mapeado.
     */
    BO toBO(DTO dto);

    /**
     * Realiza o mapeamento de um BO para um DTO.
     *
     * @param entity O objeto BO a ser mapeado para um objeto DTO.
     * @return O objeto DTO correspondente ao BO mapeado.
     */
    DTO toDTO(BO entity);

}
