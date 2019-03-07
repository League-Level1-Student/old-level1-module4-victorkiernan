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
	 char keycode;
	 JLabel label;
public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
	tutor.TutorMaker();
	
	}
public void TutorMaker() {
	frame = new JFrame();
	 panel = new JPanel();
	 label = new JLabel();
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
 keycode=arg0.getKeyChar();
System.out.println(keycode);
System.out.println(currentLetter);
if(keycode==currentLetter) {
	System.out.println("Correct");
	currentLetter = generateRandomLetter();
	letter=Character.toString(currentLetter);
	label.setText(letter);
	panel.setBackground(Color.green);
}
else {
	panel.setBackground(Color.red);
	currentLetter = generateRandomLetter();
	letter=Character.toString(currentLetter);
	label.setText(letter);
}
}
public void keyReleased(KeyEvent arg0) {
	if(keycode==currentLetter) {
		//System.exit(0);
		
	}
}
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
}
}
