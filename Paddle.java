import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics; 


public class Paddle extends JPanel {

	private static final long serialVersionUID = 180016842234982117L;
	
	public static int width = 30;
	public static int height = 150;
	public int x = 0;  
	public int y = 0;
	
	
	public Paddle(int x, int y)
	{
		this.x = x; 
		this.y = y;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
    }
	
	
	
	
}
