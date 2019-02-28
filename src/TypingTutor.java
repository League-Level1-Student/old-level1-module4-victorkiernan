import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	String letter;
	JFrame frame;
	 Random r;
	 JPanel panel;
public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
	tutor.TutorMaker();
	
	}
public void TutorMaker() {
	frame = new JFrame();
	 panel = new JPanel();
	JLabel label = new JLabel();
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.add(panel);
	panel.add(label);
	currentLetter = generateRandomLetter();
	letter=Character.toString(currentLetter);
	label.setFont(label.getFont().deriveFont(750.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setText(letter);
	System.out.println(letter);
	frame.pack();
	}

	
char generateRandomLetter() {
       r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
public void keyPressed(KeyEvent arg0) {
char keycode=arg0.getKeyChar();
System.out.println(keycode);
System.out.println(currentLetter);
if(keycode==currentLetter) {
	panel.setBackground(Color.green);
}
else {
	panel.setBackground(Color.red);
}
}
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
}
