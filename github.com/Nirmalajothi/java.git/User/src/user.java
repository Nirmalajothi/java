import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class user extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField DOB;
	private JTextField email;
	private JTextArea solution;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user frame = new user();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 515, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("User Application Form");
		
		lblNewLabel.setBounds(138, 33, 134, 14);
		panel.add(lblNewLabel);

		JLabel first = new JLabel("First Name");
		
		first.setBounds(58, 74, 91, 14);
		panel.add(first);

		JLabel last = new JLabel("Last Name");
		
		last.setBounds(58, 115, 66, 14);
		panel.add(last);

		JLabel date = new JLabel("Date of Birth");
		
		date.setBounds(58, 154, 91, 14);
		panel.add(date);

		JLabel gender = new JLabel("Gender");
		
		gender.setBounds(58, 188, 66, 14);
		panel.add(gender);

		JLabel emailid = new JLabel("Email ID");
		
		emailid.setBounds(58, 227, 91, 14);
		panel.add(emailid);

		firstname = new JTextField();
		firstname.setBounds(246, 71, 120, 20);
		panel.add(firstname);
		firstname.setColumns(10);

		lastname = new JTextField();
		lastname.setBounds(246, 112, 120, 20);
		panel.add(lastname);
		lastname.setColumns(10);

		DOB = new JTextField();
		DOB.setBounds(246, 151, 120, 20);
		panel.add(DOB);
		DOB.setColumns(10);

		final JRadioButton male = new JRadioButton("male");
		buttonGroup.add(male);
		male.setBounds(246, 184, 66, 23);
		panel.add(male);

		JRadioButton female = new JRadioButton("female");
		buttonGroup.add(female);
		female.setBounds(314, 184, 66, 23);
		panel.add(female);

		email = new JTextField();
		email.setBounds(246, 227, 137, 20);
		panel.add(email);
		email.setColumns(10);

		JButton click = new JButton("Submit");
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=firstname.getText();
				String b=lastname.getText();
				String c=DOB.getText();
	            String d=male.getText();
	            if(male.isSelected())
	            {
	            d="Gender\tMale"
	            		+ "\n";
	            }

	            else
	            {
	            	d="Gender\tFemale"
	            	+ "\n";
	            }
	            String f=email.getText();

				solution.setText("Registration Successful ! ! Your details are:"+"\n\n"+"First Name\t"+a+"\n"+"Last Name\t"+b+"\n"+"Date of Birth\t"+c+"\n"+d+"Email ID\t"+f);
			}
		});
		click.setBackground(Color.GRAY);
		click.setForeground(Color.BLACK);
		click.setFont(new Font("Times New Roman", Font.BOLD, 13));
		click.setBounds(175, 258, 89, 23);
		panel.add(click);

		solution = new JTextArea();
		solution.setBounds(28, 292, 411, 139);
		panel.add(solution);
	}
}