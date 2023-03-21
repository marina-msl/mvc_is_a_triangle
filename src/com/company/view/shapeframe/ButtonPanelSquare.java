package com.company.view.shapeframe;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.company.view.frame.ButtonPanel;

public class ButtonPanelSquare extends ButtonPanel {
	
	private JButton calculateTypeTriangle;
	
	public ButtonPanelSquare() {
		buildLayout();
	}

	private void buildLayout() {
		calculateTypeTriangle = new JButton("Calculate");
		add(calculateTypeTriangle);
	}
	
	public void addListenet(ActionListener listener) {
		calculateTypeTriangle.addActionListener(listener);
	}

}
