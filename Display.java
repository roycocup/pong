import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Display extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	
	static int l_score = 0; 
	static int r_score = 0;
	
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		int font_size = 100;
		g.setFont(new Font("TimesRoman", Font.PLAIN, font_size)); 
		g.drawString(Integer.toString(l_score), Pong.width/2-50, font_size);
		g.drawString(Integer.toString(r_score), Pong.width/2+50, font_size);
    }
	
	
}
