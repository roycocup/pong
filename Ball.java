import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics; 
import java.util.Random;

public class Ball extends JPanel{

	private static final long serialVersionUID = 180016842234982117L;
	
	boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    static double step = 1.8;
	
	int radius = 20; 
	double x = Pong.width/2;  
	double y = Pong.height/2;
	
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillArc((int)x, (int)y, radius, radius, 0, 360);
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
			Display.l_score = Display.l_score+1;
			right = false;
			left = true;
		}
		
		//ball at the left wall
		if( x <= 0){
			Display.r_score++;
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
		int[] l_paddle_surface = {(int) Pong.paddle_left.y, (int) (Pong.paddle_left.y + Paddle.height)};
		int[] r_paddle_surface = {(int) Pong.paddle_right.y, (int) (Pong.paddle_right.y + Paddle.height)};
		
		if (x <= Pong.paddle_left.x + Paddle.width){
			if (y >= l_paddle_surface[0] && y <= l_paddle_surface[1]){
				left = false; 
				right = true;
			}
		}
		
		if (x >= Pong.paddle_right.x-Paddle.width/2){
			if (y >= r_paddle_surface[0] && y <= r_paddle_surface[1]){
				left = true; 
				right = false;
			}
		}
		
	}
}
