import javax.swing.JFrame;

public class Pong {

	public Renderer renderer = new Renderer();
	public static Ball ball = new Ball();
	public static Paddle paddle_left ;
	public static Paddle paddle_right;
	
	// Pitch size
	public static final int width = 900; 
	public static final int height = 500;
    int game_speed = 4;
	
	
	
	public static void main(String[] args) {
		new Pong();
	}
	
	
	public Pong()
	{
		int wall_dist = 10; 
		int right_wall_dist = width - Paddle.width - wall_dist;
		int left_wall_dist = wall_dist;
		
		paddle_right = new Paddle(right_wall_dist, 0);
		paddle_left = new Paddle(left_wall_dist, 0);
		
		JFrame frame = new JFrame("Pong");
		frame.add(renderer);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		run();
	}
	
	public void run()
	{
		while(1==1)
			update();
	}
	
	
	public void update()
	{
		ball.update();
//		paddle_right.update();
//		paddle_left.update();
		try{
            Thread.sleep(game_speed);
            renderer.repaint();
        } catch ( Exception e){
        	e.printStackTrace();
        }
	}
	

}
