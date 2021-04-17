package com.ceyun.mapstructTest.mapper;

import org.mapstruct.Mapper;

import com.ceyun.mapstructTest.domain.Variant;
import com.ceyun.mapstructTest.dto.VariantDTO;

@Mapper(componentModel = "spring")
public interface VariantDTOMapper extends BaseDTOMapper<VariantDTO, Variant> {
    
}