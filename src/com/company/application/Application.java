package com.company.application;

import com.company.controller.Controller;
import com.company.view.TriangleFrame;

public class Application {

	public static void main(String[] args) {
		
		//new Controller(new TriangleView());
		new Controller(new TriangleFrame());
	}
}