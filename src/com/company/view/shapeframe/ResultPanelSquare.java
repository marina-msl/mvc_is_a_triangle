package com.company.view.shapeframe;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import com.company.view.frame.ResultPanel;

public class ResultPanelSquare extends ResultPanel {
	
	private JLabel labelResult;
	
	public ResultPanelSquare() {
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
