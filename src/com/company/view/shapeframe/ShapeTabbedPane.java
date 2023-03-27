package com.company.view.shapeframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.company.view.frame.ButtonPanel;
import com.company.view.frame.ResultPanel;
import com.company.view.frame.SidePanel;

public class ShapeTabbedPane extends JTabbedPane {
	
//	private SidePanel sidesView; 
//	private ResultPanel resultPanel;
//	private ButtonPanel buttonPanel;
	
	public ShapeTabbedPane() {
        
        this.setPreferredSize(new Dimension(500, 300));
        
        this.add("Triangle",  trianglebuildLayout());
        this.setMnemonicAt(0, KeyEvent.VK_1);
        
        this.addTab("Square", squareBuildLayout());
        this.setMnemonicAt(1, KeyEvent.VK_2);
        
        
        //The following line enables to use scrolling tabs.
        this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        panel.setSize(new Dimension(500,500));
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    //Factory
	private JComponent trianglebuildLayout() {
		JPanel panel = new JPanel();
		SidePanel sidesView = new SidePanel();
		ResultPanel resultPanel = new ResultPanel();
		ButtonPanel buttonPanel = new ButtonPanel("Triangle");
		
		JButton buttonTriangle = new JButton("Info Triangle");
		buttonTriangle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InformationsFrame();
				
			}
		});
		
		
		panel.add(sidesView, BorderLayout.WEST);
		panel.add(resultPanel, BorderLayout.EAST);
		panel.add(buttonPanel, BorderLayout.PAGE_END);
		return panel;
	}
	
	private JComponent squareBuildLayout() {
		JPanel panel = new JPanel();
		
		SidePanelSquare sidesViewSquare = new SidePanelSquare();
		ResultPanelSquare resultPanel = new ResultPanelSquare();
		ButtonPanel buttonPanel = new ButtonPanel("Square");
		
		panel.add(sidesViewSquare, BorderLayout.WEST);
		panel.add(resultPanel, BorderLayout.EAST);
		panel.add(buttonPanel, BorderLayout.PAGE_END);
		
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
}
