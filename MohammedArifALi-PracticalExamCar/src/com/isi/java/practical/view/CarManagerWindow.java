package com.isi.java.practical.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;
import com.isi.java.practical.model.ICarModel;

public class CarManagerWindow extends JFrame implements ICarView
{	
	
	private JLabel drivingStateLabel;
	private JLabel fillingStateLabel;
	private JLabel gasLevelLabel;
	private JProgressBar gasLevelProgressBar;

	private static final DecimalFormat levelFormat = new DecimalFormat("0.0");
	
	public CarManagerWindow() ////
	{
		super("Car manager");
		

		
		// Create/configure basic components

		JButton driveCarButton = new JButton("Drive car");
		JButton stopCarButton = new JButton("Stop car");

		JLabel drivingStateTextLabel = new JLabel("State:");
		this.drivingStateLabel = new JLabel(CarState.Stopped.getDrivingState());

		JButton startFillingButton = new JButton("Start filling gas");
		JButton stopFillingButton = new JButton("Stop filling gas");

		JLabel fillingStateTextLabel = new JLabel("State:");
		this.fillingStateLabel = new JLabel(CarState.Stopped.getFillingState());

		JLabel gasLevelTextLabel = new JLabel("Gas level:");
		this.gasLevelLabel = new JLabel(levelFormat.format(0));
		JLabel gasCapacityTextLabel = new JLabel("Gas capacity:");
		JLabel gasCapacityLabel = new JLabel(levelFormat.format(0));

		this.gasLevelProgressBar = new JProgressBar(0, 100);

		JButton newCarButton = new JButton("New car");
		JButton exitButton = new JButton("Exit");

		
		// Add action listeners to buttons

		addListenersToButtons(
				driveCarButton, stopCarButton,
				startFillingButton, stopFillingButton,
				newCarButton, exitButton);
		
		
		// Add components to panels

		JPanel driveStopCarPanel = new JPanel();
		driveStopCarPanel.add(driveCarButton);
		driveStopCarPanel.add(stopCarButton);

		JPanel drivingStatePanel = new JPanel();
		drivingStatePanel.add(drivingStateTextLabel);
		drivingStatePanel.add(Box.createRigidArea(new Dimension(5, 0)));
		drivingStatePanel.add(drivingStateLabel);

		JPanel startStopFillingPanel = new JPanel();
		startStopFillingPanel.add(startFillingButton);
		startStopFillingPanel.add(stopFillingButton);

		JPanel fillingStatePanel = new JPanel();
		fillingStatePanel.add(fillingStateTextLabel);
		fillingStatePanel.add(Box.createRigidArea(new Dimension(5, 0)));
		fillingStatePanel.add(fillingStateLabel);

		JPanel gasLevelPanel = new JPanel();
		gasLevelPanel.add(gasLevelTextLabel);
		gasLevelPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		gasLevelPanel.add(gasLevelLabel);

		JPanel gasCapacityPanel = new JPanel();
		gasCapacityPanel.add(gasCapacityTextLabel);
		gasCapacityPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		gasCapacityPanel.add(gasCapacityLabel);

		JPanel levelCapacityPanel = new JPanel(new GridLayout(1, 2, 0, 0));
		levelCapacityPanel.add(gasLevelPanel);
		levelCapacityPanel.add(gasCapacityPanel);

		JPanel gasProgressPanel = new JPanel();
		gasProgressPanel.add(gasLevelProgressBar);

		JPanel controlButtonsPanel = new JPanel();
		controlButtonsPanel.add(newCarButton);
		controlButtonsPanel.add(exitButton);


		// Add components/panels to content pane

		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(7, 1, 0, 10));
		contentPane.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		contentPane.add(driveStopCarPanel);
		contentPane.add(drivingStatePanel);
		contentPane.add(startStopFillingPanel);
		contentPane.add(fillingStatePanel);
		contentPane.add(levelCapacityPanel);
		contentPane.add(gasProgressPanel);
		contentPane.add(controlButtonsPanel);
		
		
		// Configure window

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	// Method for adding action listeners to buttons
	
	private void addListenersToButtons(
			JButton driveCarButton, JButton stopCarButton,
			JButton startFillingButton, JButton stopFillingButton,
			JButton newCarButton, JButton exitButton)
	{
		
		driveCarButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.driveCarbuttons();
			}
			catch (CapacityException e)
			{
				displayMessage(ex.getMessage());
			}
		});
		
		stopCarButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.stopCarButtons();
			}
			catch (CapacityException e)
			{
				displayMessage(ex.getMessage());
			}
		});
		
		startFillingButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.startFillingButton();
			}
			catch (CapacityException e)
			{
				displayMessage(e.getMessage());
			}
		});
		
		stopFillingButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.stopFillingButton();
			}
			catch (CapacityException e)
			{
				displayMessage(e.getMessage());
			}
		});
		
		newCarButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.newCarButton();
			}
			catch (CapacityException e)
			{
				displayMessage(e.getMessage());
			}
		});
		exitButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				ICarModel.exitButton();
			}
			catch (CapacityException e)
			{
				displayMessage(e.getMessage());
			}
		});
	}


	}

	
	// Update view methods
	// Implementation of ICarView interface
	
	@Override
	public void updateGasLevel(GasLevelEvent event)
	{
		////
	}

	public void updateCarState(CarState carState)
	{
		////
	}
}
