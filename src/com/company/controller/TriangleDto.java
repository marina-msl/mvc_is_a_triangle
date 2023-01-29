package com.company.controller;

import com.company.domain.Triangle;

public class TriangleDto {
	
	private String sideOne;
	private String sideTwo;
	private String sideThree;
	
	public TriangleDto() {

	}
	
	public TriangleDto(String sideOne, String sideTwo, String sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public String getSideOne() {
		return sideOne;
	}
	
	public void setSideOne(String sideOne) {
		this.sideOne = sideOne;
	}
	
	public String getSideTwo() {
		return sideTwo;
	}
	
	public void setSideTwo(String sideTwo) {
		this.sideTwo = sideTwo;
	}
	
	public String getSideThree() {
		return sideThree;
	}
	
	public void setSideThree(String sideThree) {
		this.sideThree = sideThree;
	}
	
	public static Triangle convert(TriangleDto dto) {
		Double sideOne = Double.parseDouble(dto.getSideOne());
		Double sideTwo = Double.parseDouble(dto.getSideTwo());
		Double sideThree = Double.parseDouble(dto.getSideThree());
		
		return new Triangle(sideOne, sideTwo, sideThree);
	}
	
}
