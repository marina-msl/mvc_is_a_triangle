package com.company.presentation;

import java.awt.event.ActionListener;

public interface IView {
	
	void setText(String text);
	
	String getTxtFirstSide();
	String getTxtSecondSide();
	String getTxtThirdSide();
	
	void setCalcTriangleActionListener(ActionListener listener);
	
}
