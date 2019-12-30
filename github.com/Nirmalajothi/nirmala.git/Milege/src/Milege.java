import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Milege {

	private JFrame frame;
	private JTextField DC;
	private JTextField PC;
	private JTextField ML;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Milege window = new Milege();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Milege() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMileageCalculator = new JLabel("MILEAGE CALCULATOR");
		lblMileageCalculator.setBounds(162, 11, 126, 14);
		frame.getContentPane().add(lblMileageCalculator);
		
		final JLabel DCK = new JLabel("Distance Calculator (km)");
		DCK.setBounds(36, 53, 118, 14);
		frame.getContentPane().add(DCK);
		
		DC = new JTextField();
		DC.setBounds(242, 50, 107, 20);
		frame.getContentPane().add(DC);
		DC.setColumns(10);
		
		JLabel PCL = new JLabel("Petrol consumed (Litres)");
		PCL.setBounds(36, 96, 118, 14);
		frame.getContentPane().add(PCL);
		
		PC = new JTextField();
		PC.setBounds(242, 96, 107, 20);
		frame.getContentPane().add(PC);
		PC.setColumns(10);
		
		JButton butP = new JButton("Press here");
		butP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(DC.getText());
				int b=Integer.parseInt(PC.getText());
				int d=a/b;
				ML.setText(""+d);
						
			}
		});
		butP.setBounds(145, 147, 107, 23);
		frame.getContentPane().add(butP);
		
		JLabel MLL = new JLabel("Mileage (litres)");
		MLL.setBounds(36, 208, 118, 14);
		frame.getContentPane().add(MLL);
		
		ML = new JTextField();
		ML.setBounds(242, 205, 107, 20);
		frame.getContentPane().add(ML);
		ML.setColumns(10);
	}

}
