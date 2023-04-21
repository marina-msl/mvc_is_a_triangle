package com.company.view.shapeframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InformationFrame extends JFrame {
	
	public InformationFrame() {
		super("Information Triangle");
		buildLayout();
		config();
	}

	private void config() {
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private void buildLayout() {
		JPanel panel = new JPanel();
		
		FlowLayout flowLayout = new FlowLayout();
		panel.setLayout(flowLayout);
		flowLayout.setAlignment(FlowLayout.TRAILING);
		
		
		
		JLabel name = new JLabel("Triangle");
		panel.add(name, BorderLayout.WEST);
		
		JTextField shapeType = new JTextField();
		panel.add(shapeType, BorderLayout.EAST);
	}
	
}
