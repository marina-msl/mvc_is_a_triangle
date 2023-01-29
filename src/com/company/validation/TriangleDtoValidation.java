package com.company.validation;

import com.company.controller.TriangleDto;

public class TriangleDtoValidation {
	
	public static boolean isFieldsValid(TriangleDto dto) {
		boolean status = true;
		
		status &= !dto.getSideOne().isBlank();
		status &= !dto.getSideTwo().isBlank();
		status &= !dto.getSideThree().isBlank();
		status &= isFormatValid(dto);
		
		return status;
	}
	
	private static boolean isFormatValid(TriangleDto dto) {
		boolean status = true;
		try {
			Double.parseDouble(dto.getSideOne());
			Double.parseDouble(dto.getSideTwo());
			Double.parseDouble(dto.getSideThree());
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
}
