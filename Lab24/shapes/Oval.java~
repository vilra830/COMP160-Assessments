package shapes;
import java.util.Random;
import java.awt.*;

public class Oval extends Shape{
  
  public Oval(){
  height = width*4;
  
    y = randomRange(0 , (400 - height));
  
  
  }
  
  
    /** generates random integers 
    @param low type int lowest number
    @param high type int highest number*/
    public int randomRange(int low, int high){
      Random generator = new Random();
      return generator.nextInt(high-low+1) + low;
    }
    
  /**draw this circle
    @param g a Graphics object*/
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x,y,width,height);
    
    
  }
  
  
}