import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements MouseListener {
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JTextField txt1;
	JTextField txt2;
	JButton add;
	JButton sub;
	JButton mult;
	JButton divi;
	String txtfield1;
	String txtfield2;
	int text1;
	int text2;
	//fbi open up
	
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
 add.addMouseListener(this);
 sub.addMouseListener(this);
 mult.addMouseListener(this);
 divi.addMouseListener(this);
 frame.pack();
 frame.setSize(275,375);
}

public void multiply() {

}
public void subtract() {

}
public void divide() {

}

public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource().equals(add)) {
			txtfield1=txt1.getText();
			txtfield2=txt2.getText();
			text1 = Integer.parseInt(txtfield1);
			text2 = Integer.parseInt(txtfield2);
			System.out.println(text1+text2);
		}
		else if(arg0.getSource().equals(sub)) {
			txtfield1=txt1.getText();
			txtfield2=txt2.getText();
			text1 = Integer.parseInt(txtfield1);
			text2 = Integer.parseInt(txtfield2);
			System.out.println(text1-text2);
		}
		else if(arg0.getSource().equals(mult)) {
			txtfield1=txt1.getText();
			txtfield2=txt2.getText();
			text1 = Integer.parseInt(txtfield1);
			text2 = Integer.parseInt(txtfield2);
			System.out.println(text1*text2);
		}
		else if(arg0.getSource().equals(divi)) {
			txtfield1=txt1.getText();
			txtfield2=txt2.getText();
			text1 = Integer.parseInt(txtfield1);
			text2 = Integer.parseInt(txtfield2);
			System.out.println(text1/text2);
			if (text2==0) {
				JOptionPane.showMessageDialog(null, "42");
				
			}
		}
		
	
}

public void mouseEntered(MouseEvent arg0) {
 
	
}

public void mouseExited(MouseEvent arg0) {
 
	
}
 
public void mousePressed(MouseEvent arg0) {
 
	
}
 
public void mouseReleased(MouseEvent arg0) {
 
	
}
}
