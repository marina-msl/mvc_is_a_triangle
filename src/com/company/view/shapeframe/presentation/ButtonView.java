package com.company.view.shapeframe.presentation;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class ButtonView extends JPanel {
	
	private JButton btCalculate;
	
	public ButtonView(String name) {
		buildLayout(name);
	}

	private void buildLayout(String name) {
		btCalculate = new JButton(name);
		add(btCalculate);
	}
	
	public void addListener(ActionListener listener) {
		btCalculate.addActionListener(listener);
	}
}
