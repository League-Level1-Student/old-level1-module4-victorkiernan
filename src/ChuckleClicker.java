import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener{
	JButton button0;
	JButton button1;
	public static void main(String[] args) {
		ChuckleClicker ChuckleClicker = new ChuckleClicker();
		ChuckleClicker.makeButtons();
	}

	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button0 = new JButton("joke");
		JButton button1 = new JButton("punchline");
		button0.addMouseListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button0);
		panel.add(button1);
		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(button0)) {
	System.out.println("I thought about going on an all-almond diet…." + 
			"But that’s just nuts!");
		}
		else if(arg0.getSource().equals(button1)) {
			System.out.println("Do not argue with an idiot. He will drag you down to his level and beat you with experience.");
		}
	}


	public void mouseClicked() {
		
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}