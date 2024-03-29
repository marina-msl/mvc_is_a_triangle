package com.company.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.company.domain.Triangle;
import com.company.presentation.IView;
import com.company.validation.TriangleDtoValidation;

public class Controller {

	private IView view;
	
	public Controller(IView view) {
		this.view = view;
		this.view.setCalculateTriangleActionListener(new ButtonCalcTriangle());
	}

	class ButtonCalcTriangle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			double sideOne = Double.parseDouble(view.getTxtFirstSide());
//			double sideTwo = Double.parseDouble(view.getTxtSecondSide());
//			double sideThree = Double.parseDouble(view.getTxtThirdSide());
			
			TriangleDto dto = view.getData();
			
			if (TriangleDtoValidation.isFieldsValid(dto)) {
				Triangle triangle = TriangleDto.convert(dto);
				
				if (triangle.isTriangle()) {
					if(triangle.isEquilateral()) {
						view.setText("Equilateral");
					} else if (triangle.isIsoceles()) {
						view.setText("Isoceles");
					} else {
						view.setText("Scalene");
					}
					
				} else {
					view.setText("Is not a triangle!");
				}
			} else {
				view.setText("Fields not valid");
			}
//			String text = calcTriangle(sideOne, sideTwo, sideThree);
//			view.setText(text);
		}
	}
	
	
//	private String calcTriangle(double sideOne, double sideTwo, double sideThree) {
//		String text = "";
//		if (sideOne == sideTwo) {
//			if (sideTwo == sideThree) {
//				text = "Equilateral Triangle";
//			}
//		} else if (sideOne == sideThree) {
//			text = "Isosceles Triangle";
//		} else {
//			text = "Scalene Triangle";
//		}
//		return text;
//	}

}
