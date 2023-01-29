package com.company.view;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel {
	
	private JLabel labelResult;
	
	public ResultPanel() {
		buildLayout();
	}

	private void buildLayout() {
		setLayout(new BorderLayout(5,5));
		labelResult = new JLabel("Rresult of Triangle Type");
		add(labelResult, BorderLayout.CENTER);
		
	}
	
	public void setText(String text) {
		labelResult.setText(text);
	}

}
