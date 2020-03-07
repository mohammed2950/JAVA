package com.isi.java.practical.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.isi.java.practical.model.CapacityException;
import com.isi.java.practical.model.Car;
import com.isi.java.practical.model.ICarModel;
import com.isi.java.practical.network.CarClient;


public class SetupWindow extends JFrame
{

	 
	 
	private static final ICarView CarManagerWindow = null;
	private JTextField capacityTextField;
	
	public SetupWindow()
	{
		super("Setup");

		JLabel capacityLabel = new JLabel("Enter gas capacity:");
		this.capacityTextField = new JTextField(8);
		JButton createCarButton = new JButton("Create car");
		
		createCarButton.addActionListener((ActionEvent e) -> setupModelView());

		JPanel capacityPanel = new JPanel();
		capacityPanel.add(capacityLabel);
		capacityPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		capacityPanel.add(capacityTextField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(createCarButton);

		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.add(capacityPanel);
		contentPane.add(buttonPanel);

		getRootPane().setDefaultButton(createCarButton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	   
	private void setupModelView( )
	{
		
		CarManagerWindow carmanager = new CarManagerWindow();
		ICarModel icarmodel =ICarModel(car);
		ICarView  icarview= (ICarView)CarManagerWindow;
		CarClient carclient = new CarClient();
		dispose();
		
	}
			
			
			
		 // Get text from capacity text field
	    // ** Convert capacity from string to double value
	    // ** Make new car (pass it the capacity)
	    // Make new window (pass it the car)
	    // Make new client (pass it the car)
	    // Set the car's view (pass it the window)
	    // Set the car's client (pass it the client)
	    // Close the setup window (dispose)
	    //
	    //// [Lines above marked ** can throw an exception]
	    //
	    // Catch first type of exception:
	    //// Call showWarningDialog(...)
	    // Catch second type of exception:
	    //// Call showWarningDialog(...)

		
		////
		////
	

	
	private ICarModel ICarModel(Car car) {
		// TODO Auto-generated method stub
		return null;
	}



	private void showWarningDialog(String message)
	{
		JOptionPane optionPane = new JOptionPane(
				message,
				JOptionPane.WARNING_MESSAGE,
				JOptionPane.DEFAULT_OPTION);
		JDialog dialog = optionPane.createDialog(this, "Warning");
		Point parentLocation = dialog.getLocation();
		dialog.setLocation(parentLocation.x, parentLocation.y + 140);
		dialog.setVisible(true);
	}




	}