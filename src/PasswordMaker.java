import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PasswordMaker {
public static void main(String[] args) {
	JFrame frame =new JFrame();
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton();
	JTextField text1= new JTextField(15);
	JTextField text2= new JTextField(20);
	frame.setVisible(true);
	text1.setEditable(true);
	text2.setText("You will see your password here.");
	text2.setEditable(false);
	frame.setTitle("Passwork Converter");
	button1.setText("Convert To Password");
	frame.add(panel1);
	panel1.add(text1);
	panel1.add(button1);
	panel1.add(text2);
	text1.getText();
	
	
	
	frame.pack();

}
}
