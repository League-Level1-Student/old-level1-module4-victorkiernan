import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine(500, 300);

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

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		java.net.URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon();
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	public SlotMachine(int width, int height) {
		frame.setVisible(true);
		frame.add(panelname, BorderLayout.NORTH);
		frame.add(middlespinner, BorderLayout.CENTER);
		frame.add(bottombutton, BorderLayout.SOUTH);
		titlename.setText("The Game You Will Never Win... I Mean You Could, Sooooo Good Luck To You");
		panelname.add(titlename);
		middlespinner.add(label1);
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
		spinreels();

	}

	public void spinreels() {
		int[] spinner = new int[3];
		middlespinner.removeAll();
		for (int i = 0; i < 3; i++) {
			int num1 = gen.nextInt(3);
			System.out.println(num1);
			spinner[i] = num1;
			if (num1 == 0) {
				try {
					middlespinner.add(createLabelImage("Cherries-512.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (num1 == 1) {
				try {
					middlespinner.add(createLabelImage("index.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					middlespinner.add(createLabelImage("slot-machine-clipart-number-7.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		middlespinner.revalidate();
		if (checkWin(spinner[0], spinner[1], spinner[2]) == true) {
			JOptionPane.showMessageDialog(null, "You won!");
		}
	}

	boolean checkWin(int a, int b, int c) {
		if (a == b && b == c) {
			return true;

		} else {
			return false;
		}
	}

}
