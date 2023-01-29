package com.company.domain;

import com.company.controller.TriangleDto;

public class Triangle {
	
	private Double sideOne;
	private Double sideTwo;
	private Double sideThree;
	
	public Triangle(Double sideOne, Double sideTwo, Double sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public Double getSideOne() {
		return sideOne;
	}
	
	public Double getSideTwo() {
		return sideTwo;
	}
	
	public Double getSideThree() {
		return sideThree;
	}
	
	public Boolean isTriangle() {
	      return (sideOne < sideTwo + sideThree) && (sideTwo < sideThree + sideOne) && (sideThree < sideOne + sideTwo);
	}
	
	public Boolean isEquilateral() {
		//return (sideOne == sideTwo) && (sideTwo == sideThree);
		return (Double.compare(sideOne, sideTwo) == 0) && (Double.compare(sideTwo, sideThree) == 0);
	}	

	public Boolean isIsoceles() {
		return (Double.compare(sideOne, sideTwo) == 0) 
				|| (Double.compare(sideTwo, sideThree) == 0)
				|| (Double.compare(sideThree, sideOne) == 0);
	}
		
	public Boolean isScanele() {
		return (sideOne != sideTwo) && (sideTwo != sideThree) && (sideThree != sideOne);
	}
	
	public static TriangleDto convert(Triangle triangle) {
		TriangleDto dto = new TriangleDto();
		
		dto.setSideOne(triangle.getSideOne().toString());
		dto.setSideTwo(triangle.getSideTwo().toString());
		dto.setSideThree(triangle.getSideThree().toString());
		
		return dto;
	}
}
