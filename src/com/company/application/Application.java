package com.company.application;

import com.company.controller.Controller;
import com.company.view.TriangleView;
import com.company.view.frame.TriangleFrame;
import com.company.view.shapeframe.ShapeFrame;

public class Application {

	public static void main(String[] args) {

		//new Controller(new TriangleView());
		new Controller(new TriangleFrame());
		//new Controller(new ShapeFrame());

	}
}
