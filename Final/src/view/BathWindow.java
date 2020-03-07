package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class BathWindow extends JFrame
{
	public BathWindow()
	{
		super("Bath manager");
		
		// create/configure basic components
		
		JButton insertPlugButton = new JButton("Insert plug");
		JButton removePlugButton = new JButton("Remove plug");
		JButton turnOnButton = new JButton("Turn on");
		JButton turnOffButton = new JButton("Turn off");

		JLabel levelTextLabel = new JLabel("Level:");
		JLabel levelLabel = new JLabel("0.0");
		JLabel capacityTextLabel = new JLabel("Capacity:");
		JLabel capacityLabel = new JLabel("0.0");
		
		JProgressBar progressBar = new JProgressBar(0, 100);

		
		JButton changeBathButton = new JButton("Change bath");
		JButton exitButton = new JButton("Exit");
		
		
		// add components to panels
		
		JPanel plugButtonsPanel = new JPanel();
		plugButtonsPanel.add(insertPlugButton);
		plugButtonsPanel.add(removePlugButton);
		
		JPanel faucetButtonsPanel = new JPanel();
		faucetButtonsPanel.add(turnOnButton);
		faucetButtonsPanel.add(turnOffButton);
		
		JPanel levelPanel = new JPanel();
		levelPanel.add(levelTextLabel);
		levelPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		levelPanel.add(levelLabel);
		
		JPanel capacityPanel = new JPanel();
		capacityPanel.add(capacityTextLabel);
		capacityPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		capacityPanel.add(capacityLabel);
				
		JPanel statsPanel = new JPanel(new GridLayout(1, 2, 0, 0));
		statsPanel.add(levelPanel);
		statsPanel.add(capacityPanel);
		
		JPanel progressPanel = new JPanel();
		progressPanel.add(progressBar);
		
		JPanel controlButtonsPanel = new JPanel();
		controlButtonsPanel.add(changeBathButton);
		controlButtonsPanel.add(exitButton);
		
		
		// add components/panels to content pane
		
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(5, 1, 0, 10));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.add(plugButtonsPanel);
		contentPane.add(faucetButtonsPanel);
		contentPane.add(statsPanel);
		contentPane.add(progressPanel);
		contentPane.add(controlButtonsPanel);
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
	}
}
