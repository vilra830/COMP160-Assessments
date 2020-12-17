package shapes;

import java.awt.*;

public class Smiley extends Shape{
  
  public Smiley(){
  
  width = height = 30;
  
  
  }
  
  /**draw this circle
    @param g a Graphics object*/
  public void display(Graphics g){
    g.setColor(Color.yellow);
    g.fillOval(x,y,width,height);
    
    g.setColor(Color.black);
    g.fillOval(x+7,y+8,width-26,height-26);
    g.fillOval(x+20,y+8,width-26,height-26);
    g.drawArc(x+8,y+10,15,13,190,160);
    
  }
  
}