package com.ceyun.mapstructTest.mapper;

import java.util.List;

/**
 * BaseDTOMapper
 */
public interface BaseDTOMapper<E, D> {

    E toDTO(D domainObject);

    D toDomainObject(E dto);

    List<E> toDTOs(List<D> dtoList);

    List<D> toDomainObjects(List<E> domainObjectList);

}