/* Shape.java
 * Lab 21, COMP160,  2018
 * graphical representation of a shape particularly shape
 * with colour, x, y, width, height
 * Coded by Rhea Villafuerte 20/09/2018
 */


package shapes;
import java.util.Random;
import java.awt.*;
import javax.swing.Timer;

public abstract class Shape{
  protected int x , y , width, height; 
  protected Color colour;
  protected int moveX = 1 ; 
  protected int moveY = 1 ;
  protected int moveWidth = 2;
  protected final int SCREEN_WIDTH = 400 - width;
  protected final int SCREEN_HEIGHT = 400 - height;
  
  
  
  
  /** constructor for the shape(circle)*/
  public Shape(){
    
    width = randomRange(10, 30);
    height = randomRange(10, 30);
    x = randomRange(0 , (400 - width));
    y = randomRange(0 , (400 - height));
    
    colour = new Color(randomRange (0, 225),randomRange (0, 225),randomRange (0, 225));
    
    if (y > 200){
      moveY = -1;
    }
    
    
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
      public abstract void display(Graphics g);
      
      
      /** moves shape according to the widthsize, x and y location.*/
      public void move(){
        
        if (width > 15 ){
          
          y += moveY;
          
          
          
        } else { 
          x += moveX;
          
        }
        
        
        if (x + width >  SCREEN_WIDTH || x  < 0 ) moveX = -moveX;
        if(y + height > SCREEN_HEIGHT || y < 0) moveY  = -moveY;
        
        
      }
      
      
      /** shows index of the given shape at x,y location*/
      public void showIndex(Graphics page, int i){
        page.setColor(Color.black);
        page.setFont(new Font("Courier", Font.PLAIN, 12));
        page.drawString(Integer.toString(i), x, y);
        
        
        
      }
      
}