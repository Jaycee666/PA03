package pa03;
import java.util.*;
import java.awt.*;
public class CliffeCircle extends CircleShape{

  private double vr=1.0;
  private int ran;

	
  public CliffeCircle(){
    super();
    this.color = new java.awt.Color(255,0,0); // transparent blue
  }


  public void update(double dt){


		this.radius += dt*vr;
    Random rand = new Random();
    ran = rand.nextInt(150);
    if(this.radius<10){
      this.vr *= -1;
      this.color = new java.awt.Color(100+ran,100,255);
    }
    else if(this.radius>10&&this.radius<50){
      this.vr *= -1;
      this.color = new java.awt.Color(100,100+ran,255);

    }
    else if(this.radius>50){
      this.color = new java.awt.Color(100,100,255,100+ran);
      this.vr *= -1;
    }
		super.update(dt);
  }
}
