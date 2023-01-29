package com.company.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.company.controller.TriangleDto;
import com.company.presentation.IView;

public class TriangleView extends JFrame implements IView {

	private JTextField textFieldFirstSide;
	private JTextField textFieldSecondSide;
	private JTextField textFieldThirdSide;
	private JLabel lblAnswerTriangleType;
	private JButton btCalculateTriangleType;
	
	public TriangleView() {
		super("What kind of triangle is it ?");
		buildLayout();
		config();
		pack();
		setVisible(true);
	}

	private void config() {
		setPreferredSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
	}

	private void buildLayout() {

		JPanel pane = new JPanel();
		add(pane);
		pane.setLayout(new GridBagLayout());

		JLabel lblFirstSide = new JLabel("Side 1");
		GridBagConstraints c1 = createGridBagConstraints(0,0);
		c1.anchor = GridBagConstraints.CENTER;
		pane.add(lblFirstSide, c1);
		
		JLabel lblSecondSide = new JLabel("Side 2");
		GridBagConstraints c3 = createGridBagConstraints(0, 1);
		c3.anchor = GridBagConstraints.CENTER;
		pane.add(lblSecondSide, c3);
		
		JLabel lblThirdSide = new JLabel("Side 3");
		GridBagConstraints c5 = createGridBagConstraints(0, 2);
		c5.anchor = GridBagConstraints.CENTER;
		pane.add(lblThirdSide, c5);
		
		textFieldFirstSide = new JTextField();
		GridBagConstraints c2 = createGridBagConstraints(1, 0);
		c2 .anchor = GridBagConstraints.WEST;
		c2.ipadx = 100;
		pane.add(textFieldFirstSide, c2);

		textFieldSecondSide = new JTextField();
		GridBagConstraints c4 = createGridBagConstraints(1, 1);
		c4.anchor = GridBagConstraints.WEST;
		c4.ipadx = 100;
		pane.add(textFieldSecondSide, c4);

		textFieldThirdSide = new JTextField();
		GridBagConstraints c6 = createGridBagConstraints(1, 2);
		c6.anchor = GridBagConstraints.WEST;
		c6.ipadx = 100;
		pane.add(textFieldThirdSide, c6);

		btCalculateTriangleType = new JButton("Calculate the type of triangle");
		GridBagConstraints c7 = createGridBagConstraints(0, 3);
		c7.gridwidth = 2;
		c7.anchor = GridBagConstraints.CENTER;
		pane.add(btCalculateTriangleType, c7);

		lblAnswerTriangleType = new JLabel();
		GridBagConstraints c8 = createGridBagConstraints(2, 1);
		c8.weightx = 2;
		pane.add(lblAnswerTriangleType, c8);

	}

	private GridBagConstraints createGridBagConstraints(int column, int line) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = column;
		gbc.gridy = line;
		gbc.weightx = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;
		return gbc;
		
	}

//	@Override
//	public String getTxtFirstSide() {
//		return textFieldFirstSide.getText();
//	}
//
//	@Override
//	public String getTxtSecondSide() {
//		return textFieldSecondSide.getText();
//	}
//
//	@Override
//	public String getTxtThirdSide() {
//		return textFieldThirdSide.getText();
//	}

	@Override
	public void setCalculateTriangleActionListener(ActionListener listener) {
		btCalculateTriangleType.addActionListener(listener);
	}

	@Override
	public void setText(String text) {
		lblAnswerTriangleType.setText(text);
	}

	@Override
	public TriangleDto getData() {
		TriangleDto dto = new TriangleDto();
		dto.setSideOne(textFieldFirstSide.getText());
		dto.setSideTwo(textFieldSecondSide.getText());
		dto.setSideThree(textFieldThirdSide.getText());
		return dto;
	}

	
}
