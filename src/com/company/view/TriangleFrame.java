package com.company.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.company.controller.TriangleDto;
import com.company.presentation.IView;

public class TriangleFrame extends JFrame implements IView {
	 
	private SidesView sidesView; 
	private ResultPanel resultPanel;
	private ButtonPanel buttonPanel;
	
	public TriangleFrame() {
		super("What king of triangle is it?");
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
	
		sidesView = new SidesView();
		resultPanel = new ResultPanel();
		buttonPanel = new ButtonPanel();
		
		add(sidesView, BorderLayout.WEST);
		add(resultPanel, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.PAGE_END);
	}
	
	public static void main(String[] args) {
		new TriangleFrame();
	}

	@Override
	public void setText(String text) {
		resultPanel.setText(text);
	}

	@Override
	public TriangleDto getData() {
		TriangleDto dto = new TriangleDto();
		dto.setSideOne(sidesView.getTextFieldSideOne());
		dto.setSideTwo(sidesView.getTextFieldSideTwo());
		dto.setSideThree(sidesView.getTextFieldSideThree());
		return dto;
	}

	@Override
	public void setCalculateTriangleActionListener(ActionListener listener) {
		buttonPanel.addListenet(listener);
	}
}