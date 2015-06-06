import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


/*
 * This is the main panel for the frame. 
 * We get all the components into this Panel via Pong main class (all static)
 * and then PAINT each one (not add) them in the paintComponent method
 */
public class Renderer extends JPanel{

	
	private static final long serialVersionUID = 13453462352523L;
	
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		Pong.ball.paint(g);
		Pong.paddle_left.paint(g);
		Pong.paddle_right.paint(g);
		
	}
	
	
	
}
