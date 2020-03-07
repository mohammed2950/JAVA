package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SetupWindow extends JFrame
{
	public SetupWindow()
	{
		super("Setup");
		
		JLabel capacityLabel = new JLabel("Bath capacity:");
		JTextField capacityTextField = new JTextField(6);
		JButton okButton = new JButton("OK");

		JPanel capacityPanel = new JPanel();
		capacityPanel.add(capacityLabel);
		capacityPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		capacityPanel.add(capacityTextField);
		
		JPanel okPanel = new JPanel();
		okPanel.add(okButton);
		
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.add(capacityPanel);
		contentPane.add(okPanel);
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{	@Override
			public void run()
			{
				new SetupWindow();
			}
		});
	}
}
