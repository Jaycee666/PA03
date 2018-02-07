package pa03;

import java.awt.*;
import java.util.Random;

public class LianCircle extends CircleShape {
	Random rand = new Random();
	int r = rand.nextInt(150);

	public LianCircle(){
		super();
		this.color = new Color(208,16,76,r+100);
	}

	public void update(double dt){
		this.x += dt*20*vx;
		this.y += dt*-5*vy;

		this.keepOnBoard();
	}

}
