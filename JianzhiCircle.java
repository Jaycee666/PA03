package pa03;

import java.awt.*;

public class JianzhiCircle extends CircleShape{
  private int alpha=255;
  private int v=50;

  public JianzhiCircle(){
    super();
  }

  public void update(double dt){
    alpha-=(int)(dt*v);
    if (alpha<0 || alpha>255){
      v=-v;
      alpha-=(int)(dt*v);
    }
    this.color=new Color(0,255,0,alpha);
    super.update(dt);
  }
}
