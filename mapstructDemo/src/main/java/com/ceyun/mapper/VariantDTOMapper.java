package com.ceyun.mapper;

import org.mapstruct.Mapper;

import com.ceyun.domain.Variant;
import com.ceyun.dto.VariantDTO;

@Mapper(componentModel = "spring")
public interface VariantDTOMapper extends BaseDTOMapper<VariantDTO, Variant> {
    
}