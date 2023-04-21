package com.company.view.shapeframe;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.company.controller.TriangleDto;
import com.company.presentation.IView;

public class ShapeFrame extends JFrame implements IView {

	private ShapeTabbedPane shapeTabbedPane;
	
	public ShapeFrame() {
		super("Shapes Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildLayout();
		this.pack();
		this.setVisible(true);
	}

	
	private void buildLayout() {
		shapeTabbedPane = new ShapeTabbedPane();
		this.add(shapeTabbedPane, BorderLayout.CENTER);
	}


	@Override
	public void setText(String text) {
		this.shapeTabbedPane.setResultText(text);
		
	}

	@Override
	public TriangleDto getData() {
		TriangleDto dto = new TriangleDto();
		dto.setSideOne(shapeTabbedPane.getTextFieldSideOne());
		dto.setSideTwo(shapeTabbedPane.getTextFieldSideTwo());
		dto.setSideThree(shapeTabbedPane.getTextFieldSideThree());
		return dto;
	}

	@Override
	public void setCalculateTriangleActionListener(ActionListener listener) {
		this.shapeTabbedPane.setActionListener(listener);
	}
}
