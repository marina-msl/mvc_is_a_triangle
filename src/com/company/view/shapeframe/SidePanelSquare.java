package com.company.view.shapeframe;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidePanelSquare extends JPanel  {
	
	JTextField textFieldSideOne;
	JTextField textFieldSideTwo;
	
	public SidePanelSquare() {
		buildLayout();
	}

	private void buildLayout() {
				
		JLabel labelSideOne = new JLabel("Side One");
		add(labelSideOne);
		
		textFieldSideOne = new JTextField();
		add(textFieldSideOne);
		
		JLabel labelSideTwo = new JLabel("Side two");
		add(labelSideTwo);
		
		
	}
	
}
