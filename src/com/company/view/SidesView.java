package com.company.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidesView extends JPanel {
	
	JTextField textFieldSideOne;
	JTextField textFieldSideTwo;
	JTextField textFieldSideThree;
	
	public SidesView() {
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
}
