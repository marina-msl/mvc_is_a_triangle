package com.company.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.company.presentation.IView;

public class Controller {

	private IView view;
	
	
	public Controller(IView view) {
		this.view = view;
		this.view.setCalcTriangleActionListener(new ButtonCalcTriangle());
	}

	class ButtonCalcTriangle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double sideOne = Double.parseDouble(view.getTxtFirstSide());
			double sideTwo = Double.parseDouble(view.getTxtSecondSide());
			double sideThree = Double.parseDouble(view.getTxtThirdSide());
			String text = calcTriangle(sideOne, sideTwo, sideThree);
			view.setText(text);
		}
		
	}
	
	
	private String calcTriangle(double sideOne, double sideTwo, double sideThree) {
		String text = "";
		if (sideOne == sideTwo) {
			if (sideTwo == sideThree) {
				text = "Equilateral Triangle";
			}
		} else if (sideOne == sideThree) {
			text = "Isosceles Triangle";
		} else {
			text = "Scalene Triangle";
		}
		return text;
	}

}
