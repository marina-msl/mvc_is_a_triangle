package com.company.view.frame;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
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
		setBorder(BorderFactory.createEmptyBorder(5,5,5,20));
		
	}
	
	public void setText(String text) {
		labelResult.setText(text);
	}

}
