import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RiddleFrame {
public static void main(String[] args) {
	RiddleFrame riddle = new RiddleFrame();
	riddle.makeui();
			
			
	
}
void makeui() {
	JFrame frame = new JFrame();
	//The answer is book worm.
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button0 = new JButton();
	JButton button1 = new JButton(); 
	JTextField textfield0 = new JTextField(20);
	JTextField textfield1 = new JTextField(15);
	frame.setTitle("Riddle");
	frame.setVisible(true);
	button0.setText("<html> Submit Answer <br> (check console) </html>");
	button1.setText("Hint");
	textfield0.setText("Answer Here (delete this text)");
	textfield0.setEditable(true);
	textfield1.setText("Hint Here");
	textfield1.setEditable(false);
	frame.add(panel);
	label.setText("<html>I heard of a wonder, of words moth-eaten.<br> "
	+ "That is a strange thing, I thought, weird.<br> "
	+ "That a man's song be swallowed by a worm.<br> "
	+ "His blinded sentences, his bedside stand-by<br>"
	+ " rustled in the night - and the robber-guest.<br> "
	+ "Not one wit the wiser. For the words he had mumbled.</html>");
	panel.add(label);
	panel.add(button0);
	panel.add(textfield0);
	panel.add(button1);
	panel.add(textfield1);
	frame.pack();
}
void answertest() {
	
}
}
