import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener  {
public static void main(String[] args) {
	SlotMachine slot = new SlotMachine(500,300);
	
}
JFrame frame = new JFrame();
JPanel middlespinner = new JPanel();
JPanel bottombutton = new JPanel();
JPanel panelname = new JPanel();
JLabel titlename = new JLabel();
JButton button = new JButton("Spin");
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
Random gen = new Random();
public SlotMachine(int width, int height) {
	frame.setVisible(true);
	frame.add(panelname, BorderLayout.NORTH);
	frame.add(middlespinner, BorderLayout.CENTER);
	frame.add(bottombutton, BorderLayout.SOUTH);
	middlespinner.add(label1);
	titlename.setText("The Game You Will Never Win... I Mean You Could So Good Luck To You");
	panelname.add(titlename);
	middlespinner.add(label2);
	middlespinner.add(label3);
	bottombutton.add(button);
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
	if(num1==-1) {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		 middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	else if(num1==2) {
		 ImageIcon icon = new ImageIcon("");
		  JLabel label = new JLabel(icon);
		 middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	else {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	int num2 = gen.nextInt(3)+1;
	label2.setText(""+num2);
	if(num2==-1) {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		  middlespinner.add(label);
			 middlespinner.setVisible(true);
	}
	else if(num2==2) {
		 ImageIcon icon = new ImageIcon("");
		  JLabel label = new JLabel(icon);
		middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	else {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		 middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	int num3= gen.nextInt(3)+1;
	label3.setText(""+num3);
	if(num3==-1) {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		 middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	else if(num3==2) {
		 ImageIcon icon = new ImageIcon("");
		  JLabel label = new JLabel(icon);
		middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
	else {
		 ImageIcon icon = new ImageIcon("Cherries-512.png");
		  JLabel label = new JLabel(icon);
		middlespinner.add(label);
		 middlespinner.setVisible(true);
	}
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

	








