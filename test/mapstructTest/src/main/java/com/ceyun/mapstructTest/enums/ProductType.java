package com.ceyun.mapstructTest.enums;

import java.util.stream.Stream;

public enum ProductType {

	TYPE_1(0, "Type_1"),
	TYPE_2(1, "Type_2");

	private int id;
	private String code;
	
	private ProductType(int id, String code) {
		this.id = id;
		this.code = code;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static ProductType getProductTypeById(int id) {
		return Stream.of(ProductType.values()).filter(v -> v.getId()==id).findAny().get();
	}
	
	public static ProductType getProductTypeByCode(String name) {
		return Stream.of(ProductType.values()).filter(v -> v.getCode().equals(name)).findAny().get();
	}
}
