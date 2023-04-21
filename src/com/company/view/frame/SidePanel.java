package com.company.view.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidePanel extends JPanel {
	
	private JTextField textFieldSideOne;
	private JTextField textFieldSideTwo;
	private JTextField textFieldSideThree;
	
	public SidePanel() {
		buildLayout();
	}

	private void buildLayout() {
		setBorder(BorderFactory.createEmptyBorder(5,20,5,5));
		setLayout(new GridBagLayout());
				
		
		JLabel labelSideOne = new JLabel("Side One");
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		c1.fill = GridBagConstraints.BOTH;
		c1.ipadx = 0;
		c1.ipady = 0;
		c1.weightx = 0.5;
		c1.weighty = 0.5;
		c1.insets = new Insets(0, 0, 0, 0);
		c1.anchor = GridBagConstraints.CENTER;
		add(labelSideOne, c1);
		
		textFieldSideOne = new JTextField();
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 1;
		c2.gridy = 0;
		c2.gridheight = 1;
		c2.gridwidth = 1;
		c2.fill = GridBagConstraints.NONE;
		c2.ipadx = 80;
		c2.ipady = 0;
		c2.weightx = 1;
		c2.weighty = 1;
		c2.insets = new Insets(5, 5, 5, 5);
		c2.anchor = GridBagConstraints.WEST;
		add(textFieldSideOne, c2);
		
		JLabel labelSideTwo = new JLabel("Side Two");
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 0;
		c3.gridy = 1;
		c3.gridheight = 1;
		c3.gridwidth = 1;
		c3.fill = GridBagConstraints.HORIZONTAL;
		c3.ipadx = 0;
		c3.ipady = 0;
		c3.weightx = 1;
		c3.weighty = 1;
		c3.insets = new Insets(5, 5, 5, 5);
		c3.anchor = GridBagConstraints.LINE_START;
		add(labelSideTwo, c3);
		
		textFieldSideTwo = new JTextField();
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 1;
		c4.gridy = 1;
		c4.gridheight = 1;
		c4.gridwidth = 1;
		c4.fill = GridBagConstraints.NONE;
		c4.ipadx = 80;
		c4.ipady = 0;
		c4.weightx = 1;
		c4.weighty = 1;
		c4.insets = new Insets(5, 5, 5, 5);
		c4.anchor = GridBagConstraints.WEST; 
		add(textFieldSideTwo, c4);
		
		JLabel labelSideThree = new JLabel("Side Three");
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridy = 2;
		c5.gridx = 0;
		c5.gridheight = 1;
		c5.gridwidth = 1;
		c5.fill = GridBagConstraints.HORIZONTAL;
		c5.ipadx = 0;
		c5.ipady = 0;
		c5.weightx = 1;
		c5.weighty = 1;
		c5.insets = new Insets(5, 5, 5, 5);
		c5.anchor = GridBagConstraints.LINE_START; 
		add(labelSideThree, c5);
		
		textFieldSideThree = new JTextField();
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridy = 2;
		c6.gridx = 1;
		c6.gridheight = 1;
		c6.gridwidth = 1;
		c6.fill = GridBagConstraints.NONE;
		c6.ipadx = 80;
		c6.ipady = 0;
		c6.weightx = 1;
		c6.weighty = 1;
		c6.insets = new Insets(5, 5, 5, 5);
		c6.anchor = GridBagConstraints.WEST; 
		add(textFieldSideThree, c6);
		
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
