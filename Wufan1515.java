package pa03;

public class Wufan1515 extends CircleShape {
	private double factor = 1.0;

	public Wufan1515 () {
		super();
		this.color = new java.awt.Color(245,150,170);
	}
	public void update(double dt){
		this.radius += dt*factor;

		if  (this.radius <10) this.factor *= -1;
		else if (this.radius > 50) this.factor *= -1;
		
		if(this.radius<10) {
			this.color = new java.awt.Color(232,122,144);
		}
		else if (this.radius>=10 && this.radius<30) {
			this.color = new java.awt.Color(203,64,66);
		}
		else if (this.radius>=30 && this.radius<50) {
			this.color = new java.awt.Color(241,124,103);
		}
		else if (this.radius>=50) {
			this.color = new java.awt.Color(232,122,144);
		}
		super.update(dt);
	}
}