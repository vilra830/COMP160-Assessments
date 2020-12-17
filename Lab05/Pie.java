import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2018 
 */
public class Pie extends JPanel{
  /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
  
  
  /** all drawing code goes in the paint method, which is called automatically*/
  public void paintComponent (Graphics page){
    super.paintComponent(page);
    //your pie chart code goes here
    
    super.paintComponent(page);
    final int X = 50;
    final int Y = 50;
    final int WIDTH = 200;
    final int HEIGHT = 200;
    
    
    
    page.setColor(Color.red);
    page.fillArc(X + 12 ,Y - 5, WIDTH, HEIGHT,360,45); // fill arc from 0 to 45 degrees with different origins
    
    page.setColor(Color.black);
    page.fillArc(X,Y, WIDTH, HEIGHT,45,45); // fill arc from 45 to 90 degrees
    
    page.setColor(Color.cyan);
    page.fillArc(X, Y, WIDTH, HEIGHT, 90, 45); // fill arc from 90 to 135   
    
    page.setColor(Color.yellow);
    page.fillArc(X,Y, WIDTH, HEIGHT,135,45); // fill arc from 135 to 180
    
    page.setColor(Color.blue);
    page.fillArc(X,Y, WIDTH, HEIGHT, 180, 45); // fill arc from 180 to 225   
    
     
    page.setColor(Color.pink);
    page.fillArc(X,Y, WIDTH, HEIGHT,225,45); // fill arc from 225 to 270
    
    page.setColor(Color.orange);
    page.fillArc(X,Y, WIDTH, HEIGHT,270,45); // fill arc from 270 to 315
    
    page.setColor(Color.green);
    page.fillArc(X,Y,WIDTH, HEIGHT,315,45); // fill arc from 315 to 360
    

    
    

  }
}