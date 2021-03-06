

import javax.swing.*;


/** a GUI application class which adds a coloured circle of random size
  * to a random location on a panel at the click of a button. Upto 20 circles maybe drawn.
  * Coded by: Rhea VIllafuerte 20/09/20198
  */
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

