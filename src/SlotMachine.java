import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
public static void main(String[] args) {
	SlotMachine slot = new SlotMachine(500,500);
	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("Spin");
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
Random gen = new Random();
public SlotMachine(int width, int height) {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	panel.add(button);
	frame.setSize(500, 500);
	label1.setText("1");
	label2.setText("2");
	label3.setText("3");
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	int num1 = gen.nextInt(3)+1;
	label1.setText(""+num1);
	int num2 = gen.nextInt(3)+1;
	label2.setText(""+num2);
	int num3= gen.nextInt(3)+1;
	label3.setText(""+num3);
	if(checkWin(num1, num2, num3) == true) {
	JOptionPane.showMessageDialog(null, "You won!");}
	
}

	boolean checkWin(int a,int b, int c) {
		if(a==b&&b==c) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

	








