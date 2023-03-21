package com.company.view.shapeframe;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.company.view.frame.SidePanel;

public class SidePanelSquare extends SidePanel {
	
	JTextField textFieldSideOne;
	JTextField textFieldSideTwo;
	JTextField textFieldSideThree;
	JTextField textFieldSideFour;
	
	public SidePanelSquare() {
		buildLayout();
	}

	private void buildLayout() {
		setLayout(new GridLayout());
				
		JLabel labelSideOne = new JLabel("Side One");
		add(labelSideOne);
		
		textFieldSideOne = new JTextField();
		add(textFieldSideOne);
		
		JLabel labelSideTwo = new JLabel("Side two");
		add(labelSideTwo);
		
		textFieldSideTwo = new JTextField();
		add(textFieldSideTwo);
		
		JLabel labelSideThree = new JLabel("Side three");
		add(labelSideThree);
		
		textFieldSideThree = new JTextField();
		add(textFieldSideThree);
		
		JLabel labelSideFour = new JLabel("Side Four");
		add(labelSideFour);
		
		textFieldSideFour = new JTextField();
		add(textFieldSideFour);
		
	}
	
	public String getTextFieldSideOne() {
		return textFieldSideOne.getText();
	}
	
	public String getTextFieldSideTwo() {
		return textFieldSideTwo.getText();
	}
	
	public String getTextFieldSideThree() {
		return textFieldSideThree.getText();
	}

	public String getTextFieldSideFour() {
		return textFieldSideFour.getText();
	}
}
