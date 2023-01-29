package com.company.presentation;

import java.awt.event.ActionListener;

import com.company.controller.TriangleDto;

public interface IView {
	
	void setText(String text);
	
//	String getTxtFirstSide();
//	String getTxtSecondSide();
//	String getTxtThirdSide();
	
	TriangleDto getData();
	
	void setCalculateTriangleActionListener(ActionListener listener);
	
}
