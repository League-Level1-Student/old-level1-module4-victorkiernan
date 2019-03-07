import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator {
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JTextField txt1;
	JTextField txt2;
	JButton add;
	JButton sub;
	JButton mult;
	JButton divi;
public void createCalc() {
 frame = new JFrame();
 panel1 = new JPanel();
 panel2 = new JPanel();
 txt1 = new JTextField(10);
 txt2 = new JTextField(10);
 add = new JButton("+");
 sub = new JButton("-");
 mult = new JButton("x");
 divi = new JButton("/");
frame.setVisible(true);
frame.add(panel2);
panel2.add(txt1);
panel2.add(txt2);
frame.add(panel1);
 panel1.add(txt1);
 panel1.add(txt2);
 panel1.add(add);
 panel1.add(sub);
 panel1.add(mult);
 panel1.add(divi);
 frame.pack();
 frame.setSize(275,375);
}
public void add() {
}
public void multiply() {
}
public void subtract() {
}
public void divide() {
}
}
