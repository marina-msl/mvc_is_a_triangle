package com.company.view.shapeframe;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.company.controller.TriangleDto;
import com.company.presentation.IView;

public class ShapeFrame extends JFrame implements IView{

	public ShapeFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new ShapeTabbedPane(), BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TriangleDto getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCalculateTriangleActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}

}
