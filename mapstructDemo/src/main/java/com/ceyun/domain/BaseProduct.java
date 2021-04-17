package com.ceyun.domain;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import com.ceyun.enums.ProductType;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BaseProduct {

	private String name;
	private Integer id;
	private int iVal;
	private Boolean bVal;
	private String carName;
	private Variant variant;
	private List<String> testList;
	private ProductType productType;
	private ProductType productType_1;
	private String password;
    private Date startDate;

	private Boolean deleted;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "tr_TR")
    private ZonedDateTime creationTime;
}
