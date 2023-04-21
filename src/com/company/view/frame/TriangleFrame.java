package com.company.view.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.company.controller.TriangleDto;
import com.company.presentation.IView;

public class TriangleFrame extends JFrame implements IView {
	 
	private SidePanel sidePanel; 
	private ResultPanel resultPanel;
	private ButtonPanel buttonPanel;
	
	public TriangleFrame() {
		super("What type of triangle is it?");
		buildLayout();
		pack();
		config();
	}
	
	private void config() {
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildLayout() {
	
		sidePanel = new SidePanel();
		resultPanel = new ResultPanel();
		buttonPanel = new ButtonPanel("Calculate the type of the Triangle");
		
		
		add(sidePanel, BorderLayout.LINE_START);
		add(resultPanel, BorderLayout.LINE_END);
		add(buttonPanel,BorderLayout.PAGE_END);
	}
	

	@Override
	public void setText(String text) {
		resultPanel.setText(text);
	}

	@Override
	public TriangleDto getData() {
		TriangleDto dto = new TriangleDto();
		dto.setSideOne(sidePanel.getTextFieldSideOne());
		dto.setSideTwo(sidePanel.getTextFieldSideTwo());
		dto.setSideThree(sidePanel.getTextFieldSideThree());
		return dto;
	}

	@Override
	public void setCalculateTriangleActionListener(ActionListener listener) {
		buttonPanel.addListener(listener);
	}
}