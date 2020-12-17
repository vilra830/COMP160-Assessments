import java.util.Random;
import java.awt.*;

/* Shape.java
 * Lab 21, COMP160,  2018
 * graphical representation of a shape particularly circle
 * with colour, x, y, width, height
 * Coded by Rhea Villafuerte 20/09/2018
 */

public class Shape{
  private int x , y , width, height; 
  private Color colour;
  
  /** constructor for the shape(circle)*/
  public Shape(){
    width = height = randomRange(10, 30);
    x = randomRange(0 , (400 - width));
    y = randomRange(0 , (400 - height));
    colour = new Color(randomRange (0, 225),randomRange (0, 225),randomRange (0, 225));
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