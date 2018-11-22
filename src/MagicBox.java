/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {
	
	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the default package) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;
MediaPalace group= new MediaPalace();
	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
	
	
		
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
		
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	System.out.println("how r u");
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		System.out.println(Integer.toHexString(backgroundImage.getRGB(e.getX(), e.getY())));
		String color = Integer.toHexString(backgroundImage.getRGB(e.getX(), e.getY()));
if(color.equals("ffaf8e5b")) {
	JOptionPane.showMessageDialog(null, "You found a secret.");}
String color1 = Integer.toHexString(backgroundImage.getRGB(e.getX(), e.getY()));
if(color1.equals("ffe0c17e")) {
String wha = JOptionPane.showInputDialog("I have a question for you, its more of a riddle. A person was wrestling a shark. One of them was wearing a tie. Who is wearing the tie?");
if(wha.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Wait how did you know?");
}
}
	}


	public void mousePressed(MouseEvent e) {
		
		// TODO Auto-generated method stub
		//System.out.println("hi");
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("good");
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("how bout u");
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("gud, gud");
	}

	
}


