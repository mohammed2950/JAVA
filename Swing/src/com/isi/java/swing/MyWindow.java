package com.isi.java.swing;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyWindow extends JFrame
{

	private PopupMenu okButton;
	private JButton submiButton;
	private JLabel myLable;
	
	private JTextField myTextField;
	
	private JCheckBox checkBoxA;
	private JCheckBox checkBoxB;
	
	private JProgressBar progressBar;
	private JSlider slider;
	private JPanel contentpane;

	public MyWindow()
	{
		super("My window");
		
		createCoponents();
		createPanels();
		addComponentsToPanel();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocation(null);
		setVisible(true);
	}
	private void createCoponents()
	{
		okButton = new JButton("Ok");
		okButton.setAlignmentX(0.5f);
		okButton.setHorizontalAlignment(SwingConstants.CENTER);
		submiButton = new JButton("submit");
		myLable = new JLabel("");
		myTextField = new JTextField();
		checkBoxA = new JCheckBox("option A",true);
		checkBoxB = new JCheckBox("option B",false);
		progressBar = new JProgressBar(0,100);
		slider = new JSlider(-50,50);
		
		
		
	}
	private void createPanels()
	{
	
		buttonpanel = new JPanel();
		Button
	contentPane =(JPanel)getContentPane();
	contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS)));
	contentPane.setBorber(BorderFactory.createEmptyBorder(20,20))
	
	
	}
	private void addComponentsToPanel()
	{
		Component buttonspanel;
		buttonspanel.add(okButton);
		buttonspanel.add();
		contentpane.add(okButton);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentpane.add(submiButton);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		contentpane.add(myLable);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		contentpane.add(myTextField);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		contentpane.add(checkBoxA);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		contentpane.add(checkBoxB));
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		contentpane.add(progressBar);
		getContentPane.add(Box.createRigidArea(new Dimension(0,20)));

		
		
		
	}
	
	
	
	
	
	
	
	
	}