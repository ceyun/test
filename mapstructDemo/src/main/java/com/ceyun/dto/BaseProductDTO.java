package com.ceyun.dto;

import java.time.ZonedDateTime;
import java.util.List;

import com.ceyun.enums.ProductType;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BaseProductDTO {
	
	private String name;
	private Integer id;
	private Integer iVal;
	private boolean bVal;
	// Different name
	private String carName_dto;
	// Custom Object
	private VariantDTO variant;
	// List
	List<String> testList;
	// Enum
	private ProductType productType;
	// Enum by id - custom mapper
	private Integer productType_1;
	// ignore
	private String password;
	// date to string date
    private String startDate;
    // default value
	private Boolean deleted;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "tr_TR")
    private ZonedDateTime creationTime;

}
