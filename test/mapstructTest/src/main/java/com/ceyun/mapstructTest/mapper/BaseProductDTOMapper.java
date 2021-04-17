package com.ceyun.mapstructTest.mapper;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.ceyun.mapstructTest.domain.BaseProduct;
import com.ceyun.mapstructTest.domain.Variant;
import com.ceyun.mapstructTest.dto.BaseProductDTO;
import com.ceyun.mapstructTest.dto.VariantDTO;
import com.ceyun.mapstructTest.enums.ProductType;

@Mapper(componentModel = "spring")
public interface BaseProductDTOMapper extends BaseDTOMapper<BaseProductDTO, BaseProduct> {
	
	@Mappings({ 
		@Mapping(target = "carName_dto",source = "carName"),
		@Mapping(source = "productType_1.id", target = "productType_1"),
	    @Mapping(target = "password", ignore = true),
		@Mapping(source = "creationTime", target = "creationTime", qualifiedByName = "timeConverter"),
		@Mapping(target="startDate", source = "startDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	@Override
	BaseProductDTO toDTO(BaseProduct domainObject);

	@Mappings({ 
		@Mapping(target = "carName",source = "carName_dto"),
		@Mapping(source = "productType_1", target = "productType_1", qualifiedByName = "productTypeConverter"),
		@Mapping(source = "creationTime", target = "creationTime", qualifiedByName = "timeConverter"),
		@Mapping(source = "deleted", target = "deleted",  defaultValue= "false"),
		@Mapping(target="startDate", source = "startDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	@Override
	BaseProduct toDomainObject(BaseProductDTO dto);
	
	@Named("timeConverter")
	default ZonedDateTime timeConverter(ZonedDateTime item) {
        if ( item == null ) {
            return null;
        }
		return item.withZoneSameInstant(ZoneId.of("Asia/Istanbul"));
	}
	

	@Named("productTypeConverter")
	default ProductType operatorStrToEnum(String item) {
		return ProductType.getProductTypeByCode(item);
	}
	
	default Variant variantDTOToVariant(VariantDTO variantDTO) {
        if ( variantDTO == null ) {
            return null;
        }
        Variant variant = new Variant();
        variant.setName( "yunus test" );
        return variant;
    }
    
}