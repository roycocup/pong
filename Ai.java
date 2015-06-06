
public class Ai {

	double step = Ball.step*0.4;
	
	public Ai()
	{
		System.out.print(step);
	}
	
	public void update()
	{
		
		//get the position of the ball
		Ball ball = Pong.ball;
		Paddle paddle = Pong.paddle_right;
		
		//if the ball is below the paddle
		if (ball.y > paddle.y || ball.y > paddle.y + Paddle.height){
			paddle.y = paddle.y+step;
		}
		//if ball is above the paddle
		if (ball.y < paddle.y ){
			paddle.y = paddle.y-step;
		}
		
		//get the paddle into that position but move it slower than the ball
		
	}
	
}
