package com.company.application;

import com.company.controller.Controller;
import com.company.view.TriangleView;

public class Application {
	
	public static void main(String[] args) {
		
		new Controller(new TriangleView());
	}

}
