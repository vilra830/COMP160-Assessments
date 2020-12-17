import javax.swing.*;
/**
 * Made by : Rhea Villafuerte 03/09/2018
 * Shows 6 diners drawn in circles with corresponding names and numbers around a rectangular table.
 * 
 */
public class DinerApp{
  
  /** creates  an instance of the TablePanel class, puts it on a frame and sets some essential parameters.*/
  public static void main(String[]args){
    JFrame frame = new JFrame("Table Seating Plan"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TablePanel tablepanel1 = new TablePanel();
    frame.getContentPane().add (tablepanel1);
    frame.pack();
    frame.setVisible(true);
  }
}