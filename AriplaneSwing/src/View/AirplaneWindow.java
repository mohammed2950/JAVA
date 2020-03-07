package com.isi.airplane.view;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import com.isi.airplane.model.Airplanestate;
import com.isi.airplane.model.IAirplaneModel;
import com.isi.airplane.model.InvalidActionException;

public class AirplaneWindow extends JFrame implements IAirplaneView
{
	private IAirplaneModel airplaneModel;

	private final DecimalFormat df = new DecimalFormat("0.00");

	private JLabel stateTitle;
	private JLabel stateLabel;
	private JLabel altitudeTitle;
	private JLabel altitudeLabel;
	private JLabel TargetAltitudeTitle;
	private JLabel TargetAltitudeLabel;
	private JProgressBar altitudeProgressBar;

	private JButton startButton;
	private JButton stopButton;
	private JButton takeOffButton;
	private JButton increaseButton;
	private JButton decreaseButton;

	private JLabel messageLabel;

	private JPanel statePanel;
	private JPanel altitudePanel;
	private JPanel stateAltitudePanel;
	private JPanel TargetAltitudePanel;
	
	private JPanel statsProgressPanel;
	private JPanel startStopPanel;
	private JPanel takeOffPanel;
	private JPanel increaseDecreasePanel;
	private JPanel messagePanel;

	private JPanel contentPane;

	public AirplaneWindow(IAirplaneModel airplaneModel)
	{
		super("Airplane manager");

		this.airplaneModel = airplaneModel;
		
		createComponents();
		addListeners();
		setupPanels();
		addComponentsToPanels();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void createComponents()
	{
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		takeOffButton = new JButton("Take off");
		increaseButton = new JButton("Increase altitude");
		decreaseButton = new JButton("Decrease altitude");

		stateTitle = new JLabel("State");
		stateLabel = new JLabel("Off");
		stateTitle.setAlignmentX(0.5f);
		stateLabel.setAlignmentX(0.5f);
		stateTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

		altitudeTitle = new JLabel("Altitude");
		altitudeLabel = new JLabel("0.0");
		altitudeTitle.setAlignmentX(0.5f);
		altitudeLabel.setAlignmentX(0.5f);
		altitudeTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		
		TargetAltitudeTitle = new JLabel("Target Altitude");
		TargetAltitudeLabel = new JLabel("0.0");
		TargetAltitudeTitle.setAlignmentX(0.5f);
		TargetAltitudeLabel.setAlignmentX(0.5f);
		TargetAltitudeTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		
		altitudeProgressBar = new JProgressBar(0, 12000);
		altitudeProgressBar.setToolTipText("Altitude");

		messageLabel = new JLabel(" ");
		messageLabel.setBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createEtchedBorder(),
						BorderFactory.createEmptyBorder(20, 20, 20, 20)));
		messageLabel.setPreferredSize(new Dimension(400, 60));
		messageLabel.setAlignmentX(0.5f);
		messageLabel.setHorizontalAlignment(SwingUtilities.CENTER);
	}

	private void addListeners()
	{
		startButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				airplaneModel.start();
			}
			catch (InvalidActionException ex)
			{
				displayMessage(ex.getMessage());
			}
		});

		stopButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				airplaneModel.stop();	
			}
			catch (InvalidActionException ex)
			{
				displayMessage(ex.getMessage());
			}
		});
		takeOffButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				airplaneModel.takeOff();	
			}
			catch (InvalidActionException ex)
			{
				displayMessage(ex.getMessage());
			}
		});
		increaseButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				airplaneModel.increaseAltitude();
					
			}
			catch (InvalidActionException ex)
			{
				displayMessage(ex.getMessage());
			}
		});
		decreaseButton.addActionListener((ActionEvent e) ->
		{
			try
			{
				airplaneModel.decreaseAltitude();
			
			}
			catch (InvalidActionException ex)
			{
				displayMessage(ex.getMessage());
			}
		});
	}

	private void setupPanels()
	{
		startStopPanel = new JPanel();
		takeOffPanel = new JPanel();
		increaseDecreasePanel = new JPanel();

		statePanel = new JPanel();
		statePanel.setLayout(new BoxLayout(statePanel, BoxLayout.Y_AXIS));

		altitudePanel = new JPanel();
		altitudePanel.setLayout(new BoxLayout(altitudePanel, BoxLayout.Y_AXIS));

		TargetAltitudePanel = new JPanel();
		TargetAltitudePanel.setLayout(new BoxLayout(TargetAltitudePanel, BoxLayout.Y_AXIS));
		
		
		stateAltitudePanel = new JPanel();
		stateAltitudePanel.setLayout(new BoxLayout(stateAltitudePanel, BoxLayout.X_AXIS));
		
			


		statsProgressPanel = new JPanel();
		statsProgressPanel.setLayout(new BoxLayout(statsProgressPanel, BoxLayout.Y_AXIS));
		statsProgressPanel.setBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createEtchedBorder(),
						BorderFactory.createEmptyBorder(20, 20, 20, 20)));

		messagePanel = new JPanel();

		// Get the contentPane JPanel created by the JFrame window
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
	}

	private void addComponentsToPanels()
	{
		statePanel.add(stateTitle);
		statePanel.add(stateLabel);

		altitudePanel.add(altitudeTitle);
		altitudePanel.add(altitudeLabel);
		
		TargetAltitudePanel.add(TargetAltitudeTitle);
		
		TargetAltitudePanel.add(TargetAltitudeLabel);
		

		stateAltitudePanel.add(statePanel);
		stateAltitudePanel.add(Box.createRigidArea(new Dimension(30, 0)));
		stateAltitudePanel.add(altitudePanel);
		stateAltitudePanel.add(Box.createRigidArea(new Dimension(30, 0)));
		stateAltitudePanel.add(TargetAltitudePanel);
		
		
		statsProgressPanel.add(stateAltitudePanel);
		statsProgressPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		statsProgressPanel.add(altitudeProgressBar);

		startStopPanel.add(startButton);
		startStopPanel.add(stopButton);
		takeOffPanel.add(takeOffButton);
		increaseDecreasePanel.add(increaseButton);
		increaseDecreasePanel.add(decreaseButton);

		messagePanel.add(messageLabel);

		contentPane.add(statsProgressPanel);
		//contentPane.add(TargetAltitudePanel);
		contentPane.add(Box.createRigidArea(new Dimension(0, 30)));
		contentPane.add(startStopPanel);
		contentPane.add(takeOffPanel);
		contentPane.add(increaseDecreasePanel);
		contentPane.add(Box.createRigidArea(new Dimension(0, 30)));
		contentPane.add(messagePanel);
	}

	@Override
	public void updateState(Airplanestate state)
	{
		// TODO Auto-generated method stub
		stateLabel.setText(state.toString());
	}

	@Override
	public void updateAltitude(double altitude) 
	{
		// TODO Auto-generated method stub
		altitudeLabel.setText(df.format(altitude));
		altitudeProgressBar.setValue((int)altitude);
	}

	@Override
	public void displayMessage(String message)
	{
		// TODO Auto-generated method stub
		messageLabel.setText(message);
	}

	@Override
	public void displayError(String message) 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,message,"Error",JOptionPane.WARNING_MESSAGE);
	}

	
	public void updateTargetAltitude(double TargetAltitude) 
	{
		TargetAltitudeLabel.setText(df.format(TargetAltitude));
		
		//TargetAltitude.setValue((int) TargetAltitude);
		// TODO Auto-generated method stub
		
	}
}