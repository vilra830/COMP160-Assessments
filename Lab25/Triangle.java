/** This program will calculate the length of sides and the perimeter of a Triangle, 
  * given the coordinates of its 3 points coded by: Rhea Villafuerte 04/10/2018*/
import java.awt.*;
import java.text.DecimalFormat;

public class Triangle{
  private int x1, y1, x2, y2, x3, y3 ;
  private String name;
  private double perimeter;
  
  
  // Creates a constructor with Triangle name and the coordinates of its 3 points as parameters
  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String name){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
    this.name = name;
    
    
  }
  
  /** This method calculates the side of each triangle.*/
  private double calcSide(int x1,int y1, int x2, int y2){
    
    double distance1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
    
    return distance1;
    
    
    
  }  
  
  /** This method calculates and returns the perimeter of the triangle */
  public double perimeter(){
    perimeter = calcSide(x1,y1,x2,y2)+calcSide(x2,y2,x3,y3)+calcSide(x3,y3,x1,y1);
    
    
    
    return perimeter;
    
    
  }
  
  /** This method returns the value of the datafield name*/
  public String getName(){
    return name ;
  }
  
  /** Draws the triangle, shows its names and its perimeter*/
  public void draw(Graphics g){

    g.setColor(Color.red);
    g.drawLine(x1,y1,x2,y2);
    g.drawLine(x2,y2,x3,y3);
    g.drawLine(x3,y3,x1,y1);
    g.setFont(new Font("Courier", Font.BOLD, 12));
    DecimalFormat fmt = new DecimalFormat("0.##"); 
    g.setColor(Color.blue);
    g.drawString(fmt.format(perimeter()) + " " + name,x1+2 , y1 -2);
    
  }
  
}


