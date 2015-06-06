import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics; 

public class Ball extends JPanel{

	private static final long serialVersionUID = 180016842234982117L;
	
	boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    int step = 1;
	
	int radius = 20; 
	int x = Pong.width/2;  
	int y = Pong.height/2;
	
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillArc(x, y, radius, radius, 0, 360);
    }
	
	
	public void update()
	{
		detectCollisionWithPitch();
		detectCollisionWithPaddle();
		
		if (up)
			y = y-step;
		if (down)
			y = y+step;
		if (left)
			x = x-step;
		if (right)
			x = x+step;
		
	}
	
	public void detectCollisionWithPitch()
	{
		
		// ball at the right wall
		if( x >= Pong.width-radius){
			right = false;
			left = true;
		}
		
		//ball at the left wall
		if( x <= 0){
			right = true;
			left = false;
		}
			
		//ball at the bottom of frame
		if (y >= Pong.height-radius*2){
			up = true;
			down = false;
		}
			
		//ball at the top of frame
		if (y <= 0){
			up = false;
			down = true;
		}
	}
	
	public void detectCollisionWithPaddle()
	{
		//get left paddle surface
		int[] paddle_surface = {Pong.paddle_left.y, Pong.paddle_left.y + Pong.paddle_left.height};
		
		if (x <= Pong.paddle_left.x + Paddle.width){
			if (y >= paddle_surface[0] && y <= paddle_surface[1]){
				left = false; 
				right = true;
			}
		}
		
	}
}
