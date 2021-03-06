/** This program will calculate the length of sides and the perimeter of a Triangle, 
  * given the coordinates of its 3 points*/

public class Triangle{
  private int x1, y1, x2, y2, x3, y3 ;
  private String name;
  
  // Creates a constructor with Triangle name and the coordinates of its 3 points as parameters
  public Triangle(int inx1, int iny1, int inx2, int iny2, int inx3, int iny3 , String triName){
    x1 = inx1;
    y1 = iny1;
    x2 = inx2;
    y2 = iny2;
    x3 = inx3;
    y3 = iny3;
    name = triName;
    
  }
  
  /** This method calculates the side of each triangle.*/
  private double calcSide(int x1,int y1, int x2, int y2){
    
    double distance1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
   
    return distance1;
    
      

  }  
  
  /** This method calculates and returns the perimeter of the triangle */
  public double perimeter(){
    double perimeter = calcSide(x1,y1,x2,y2)+calcSide(x2,y2,x3,y3)+calcSide(x3,y3,x1,y1);
    
    
       
    return perimeter;
    
  
  }
  
  /** This method returns the value of the datafield name*/
  public String getName(){
    return name ;
  }
 
   
}