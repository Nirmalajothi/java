import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DiscountCalculation {

private JFrame frame;
private JTextField PAT;
private JTextField DPT;
private JTextField NPT;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
DiscountCalculation window = new DiscountCalculation();
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
public DiscountCalculation() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(new Color(135, 206, 250));
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lbl = new JLabel("DISCOUNT CALCULATOR");
lbl.setBounds(179, 35, 130, 14);
frame.getContentPane().add(lbl);

JLabel PA = new JLabel("Principal amount");
PA.setBounds(78, 86, 90, 14);
frame.getContentPane().add(PA);

JLabel DP = new JLabel("Discount percentage");
DP.setBounds(78, 126, 105, 14);
frame.getContentPane().add(DP);

PAT = new JTextField();
PAT.setBounds(231, 83, 86, 20);
frame.getContentPane().add(PAT);
PAT.setColumns(10);

DPT = new JTextField();
DPT.setBounds(231, 123, 86, 20);
frame.getContentPane().add(DPT);
DPT.setColumns(10);

JButton butCal = new JButton("calculate");
butCal.setBounds(163, 164, 89, 23);
butCal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
double Principlamount=Integer.parseInt(PAT.getText());
double percentage=Integer.parseInt(DPT.getText());
double dis=(percentage/100)*Principlamount;
double fin=Principlamount-dis;
int Finally=((int)fin);

NPT.setText(""+Finally);






}
});
frame.getContentPane().add(butCal);

JLabel NP = new JLabel("Net price");
NP.setBounds(78, 214, 46, 14);
frame.getContentPane().add(NP);

NPT = new JTextField();
NPT.setBounds(231, 211, 86, 20);
frame.getContentPane().add(NPT);
NPT.setColumns(10);

}
}