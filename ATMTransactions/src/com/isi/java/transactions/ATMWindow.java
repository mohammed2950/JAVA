package com.isi.java.transactions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ATMWindow extends JFrame
{


	private JPanel contentPane;

	private JLabel balance;
	private JLabel amount;
	private JLabel noTrans;

	private JTextField textField;

	private JButton deposit;
	private JButton withdrawl;
	private JButton exit;

	public ATMWindow()
	{
		super("ATM");
		
		createComponents();
		 addListenersToButtons();
		 createPanels();
		addComponentsToPanels();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();//auto window size according to the elements
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);

	}

	private void addListenersToButtons() 
	{
		deposit.addActionListener((ActionEvent e) ->
		{
			
			Account.deposit(Double.parseDouble(textField.getText()));
			
		});
		
	withdrawl.addActionListener((ActionEvent e) ->
	{
		
		Account.withdraw(Double.parseDouble(textField.getText()));
		
	});
	exit.addActionListener((ActionEvent e )-> System.exit(0));
	
	
	}

	private void addComponentsToPanels()
	{
		
		for(int i=0;i<(1*7);i++)
		{
			//contentPane.add(new JButton(Integer.toString(i)));
			switch(i){
			case 0:
				contentPane.add(balance);
				break;
			case 1:	
				contentPane.add(amount);
				break;
			case 2:	
				contentPane.add(textField);
				break;
			case 3: 
				contentPane.add(deposit);
				break;
			case 4: 
				contentPane.add(withdrawl);
				break;
			case 5: 
				contentPane.add(exit);
				break;
			case 6:
				contentPane.add(noTrans);
				break;

			}
		}

	}

	private void createPanels() 
	{
		
		contentPane=(JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(7, 1, 0, 10));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	}

	private void createComponents() 
	{
		
		balance = new JLabel("Balance");


		amount =new JLabel("$0.00");

		textField =new JTextField("");
		deposit =new JButton("Deposit");
		withdrawl =new JButton("Withdrawal");
		exit =new JButton("Exit");

		noTrans=new JLabel("No Transaction Performed");


	}

	public static void sucessMessage(String transType)
	{
		JOptionPane.showMessageDialog(null, "SUCESSFULL"+transType );
		
	}

	public static void insufficientfunds() 
	{
		
		JOptionPane.showMessageDialog(null, "INSUFFICENTFUNDS/ERROR" );	
	}

}
