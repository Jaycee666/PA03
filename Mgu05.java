package pa03;
import java.util.*;
import java.awt.*;


public class Mgu05 extends CircleShape {
	Random rand = new Random();
	private int factor = rand.nextInt(5);

	public Mgu05(){
		super();
		this.color = new Color(105, 176, 172);
	}


	public void update(double dt){

		if(this.factor%2 == 0){
			this.color = new Color(181, 202, 160);
		}

		this.x += factor*10*dt*vx;  // for now they do not move
		this.y += factor*10*dt*vy;

		this.keepOnBoard();

		super.update(dt);
	}
}
