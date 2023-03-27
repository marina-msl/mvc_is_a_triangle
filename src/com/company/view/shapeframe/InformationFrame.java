package com.company.view.shapeframe;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InformationFrame extends JFrame {
	
	public InformationFrame() {
		buildLayout();
		pack();
		config();
		setVisible(true);
	}

	private void config() {
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void buildLayout() {
		JPanel panel = new JPanel();
		
		JLabel name = new JLabel("Triangle");
		add(name);
		
		JTextField shapeType = new JTextField();
		add(shapeType);
		
		
		
	}
	
}
