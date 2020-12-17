import java.awt.*;

/**This class represents a single diner by means of a filled circle. It has an x and y location, 
  * a name, a colour representing gender and a number representing the seating position
  */


public class Diner{
  private int x , y , seatNum ;
  private String name;
  private Color colour;
  private final int DIAMETER = 50;
  
  /**Sets datafields representing x and y location of circle, name , color and seat number of the diner*/ 
  public Diner (int inx , int iny, String nameIn , Color colourIn, int seatNumIn){
    x = inx ;
    y = iny;
    name = nameIn;
    seatNum = seatNumIn;
    colour = colourIn; 
    
  }
  /** This method draws and sets the color of the circle, and affixes a name and a number inside it.  
    * @param page graphic object
    */
  
  public void draw(Graphics page){
    page.setColor(colour);
    page.fillOval(x,y,DIAMETER,DIAMETER);
    
    page.setColor(Color.black);
    page.setFont(new Font("Courier", Font.PLAIN, 10));
    page.drawString(String.valueOf(seatNum) , x+23 , y+10);
    
    
    page.setColor(Color.black);
    page.setFont(new Font("Courier", Font.PLAIN, 12));
    page.drawString(name, x+2 , y+30);
    
    
    
    
    
  }
  
  
}