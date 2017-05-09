package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new GamePannel());
		frame.setResizable(false);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension (GamePannel.WIDTH, GamePannel.HEIGHT));
		frame.setVisible(true);
		
	}

}
