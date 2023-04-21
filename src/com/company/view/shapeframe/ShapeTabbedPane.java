package com.company.view.shapeframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.company.view.frame.ButtonPanel;
import com.company.view.frame.ResultPanel;
import com.company.view.frame.SidePanel;

public class ShapeTabbedPane extends JTabbedPane {
	
	
	private SidePanel sidePanel; 
	private ResultPanel resultPanel;
    private ButtonPanel buttonPanel;
    
	public ShapeTabbedPane() {
		config();
        
        this.add("Triangle",  trianglebuildLayout());
        this.setMnemonicAt(0, KeyEvent.VK_1);
        
        ImageIcon icon  = createImageIcon("image/Square.png");
        
        this.addTab("Square", icon, squareBuildLayout());
        this.setMnemonicAt(1, KeyEvent.VK_2);
        
        //The following line enables to use scrolling tabs.
        this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
	private void config() {
		this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 300));
	}

	private JComponent trianglebuildLayout() {
		JPanel panel = new JPanel();
		
		sidePanel = new SidePanel();
		resultPanel = new ResultPanel();
		buttonPanel = new ButtonPanel("Calculate the type of triangle");
		
		JButton buttonTriangle = new JButton("Info Triangle");
		buttonTriangle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InformationFrame();
				
			}
		});
		
		panel.add(buttonTriangle, BorderLayout.PAGE_START);
		panel.add(sidePanel, BorderLayout.LINE_START);
		panel.add(resultPanel, BorderLayout.LINE_END);
		panel.add(buttonPanel, BorderLayout.PAGE_END);
		
		return panel;
	}
	
	private JComponent squareBuildLayout() {
		JPanel panel = new JPanel();
		
		SidePanelSquare sidesViewSquare = new SidePanelSquare();
		ResultPanelSquare resultPanel = new ResultPanelSquare();
		//buttonPanel = new ButtonPanel("Square");
		
		panel.add(sidesViewSquare, BorderLayout.WEST);
		panel.add(resultPanel, BorderLayout.EAST);
		//panel.add(buttonPanel, BorderLayout.PAGE_END);
		
		return panel;
	}
	
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ShapeTabbedPane.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

	public String getTextFieldSideOne() {
		return sidePanel.getTextFieldSideOne();
	}
	
	public String getTextFieldSideTwo() {
		return sidePanel.getTextFieldSideTwo();
	}
	
	public String getTextFieldSideThree() {
		return sidePanel.getTextFieldSideThree();
	}
	
	public void setActionListener(ActionListener listener) {
		buttonPanel.addListener(listener);
	}

	public void setResultText(String text) {
		resultPanel.setText(text);
	}
}
