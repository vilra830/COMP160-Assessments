import java.text.DecimalFormat;

/** This Application will show the name of a triangle and its perimeter*/


public class TriangleApp{
  public static void main(String [ ] args) {
    Triangle a = new Triangle(0,3,3,4,1,9,"A");
    Triangle b = new Triangle(4,2,5,7,9,4,"B");
    Triangle c = new Triangle(4,6,2,9,6,9,"C");
    
    /** For formatting perimeter upto 2 decimal units */
    
    DecimalFormat fmt = new DecimalFormat("0.##"); 
    
    
    
    System.out.println("Triangle " +a.getName()+ " perimeter is " + fmt.format(a.perimeter()) + " units");
    System.out.println("Triangle " +b.getName()+ " perimeter is " + fmt.format(b.perimeter()) + " units");
    System.out.println("Triangle " +c.getName()+ " perimeter is " + fmt.format(c.perimeter()) + " units");
    
  }
}