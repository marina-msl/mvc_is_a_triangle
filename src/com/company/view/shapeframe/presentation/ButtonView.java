package com.company.view.shapeframe.presentation;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class  ButtonView extends JPanel {
	
	private JButton calculate;
	
	public ButtonView(String name) {
		buildLayout(name);
	}

	private void buildLayout(String name) {
		calculate = new JButton(name);
		add(calculate);
	}
	
	public void addListenet(ActionListener listener) {
		calculate.addActionListener(listener);
	}
}
