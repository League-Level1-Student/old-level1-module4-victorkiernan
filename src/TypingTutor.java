import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	String letter;
public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
	tutor.TutorMaker();
	
	}
public void TutorMaker() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	label.setText(letter);
	label.setFont(label.getFont().deriveFont(28.0f));
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.add(panel);
	panel.add(label);
	currentLetter = generateRandomLetter();
	letter=Character.toString(currentLetter);
	frame.pack();
	}
char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
}
