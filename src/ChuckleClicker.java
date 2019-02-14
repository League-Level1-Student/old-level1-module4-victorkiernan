import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener{
	public static void main(String[] args) {
		ChuckleClicker.makeButtons();
	}

	static void makeButtons() {
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
		if(mouseClicked(true)) {
			JOptionPane.showMessageDialog(null, "<html>h<br>i<html>");
		}
}

	public void mouseClicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}