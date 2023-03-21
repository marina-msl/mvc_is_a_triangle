package com.company.view.frame;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	private JButton calculateTypeTriangle;
	
	public ButtonPanel() {
		buildLayout();
	}

	private void buildLayout() {
		calculateTypeTriangle = new JButton("Calculate Type of Triangle");
		add(calculateTypeTriangle);
	}
	
	public void addListenet(ActionListener listener) {
		calculateTypeTriangle.addActionListener(listener);
	}
}
