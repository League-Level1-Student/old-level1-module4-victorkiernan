import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class WhackaMole implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	Random r;
public static void main(String[] args) {
 WhackaMole game = new WhackaMole();
 game.setup();
 game.buttonMaker();
}
public void setup() {
frame = new JFrame();
panel = new JPanel();
frame.setSize(350, 100);
frame.setVisible(true);
frame.add(panel);

}
public int buttonMaker() {
	for (int i = 0; i < 24 ; i++) {
		button = new JButton();
		button.addMouseListener(this); 
		button.setSize(50, 100);
		panel.add(button);
}
	 r = new Random();
	 return (r.nextInt(24));
}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
