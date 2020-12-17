/** a GUI application class which adds different shapes 
  * to a random location on a panel at the click of the corresponding button. Upto 20 different shapes maybe drawn.
  * Coded by: Rhea VIllafuerte 27/09/20198
  */

package shapes;
import javax.swing.*;
import javax.swing.Timer;
public class ShapePanelApp{
  /** creates  an instance of the ShapePanel class*/
  public static void main(String[]args){
    JFrame frame = new JFrame("Shapes"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ShapePanel shape = new ShapePanel();
    frame.getContentPane().add (shape);
    frame.pack();
    frame.setVisible(true);
  }
}

