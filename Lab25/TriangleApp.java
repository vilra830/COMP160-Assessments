import javax.swing.*;
/** TriangleApp.java
 * Lab 25, COMP160,  2018
 * GUI Representation of Lab 8 with Gridlines.
 * Coded by: Rhea Villafuerte 3/10/2018
 */

public class TriangleApp{
  
  /**Creates a JFrame object and adds instance of TrianglePanel to it*/
  public static void main(String[]args){
    JFrame fileFrame = new JFrame();
    fileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fileFrame.getContentPane().add(new TrianglePanel());
    fileFrame.pack();
    fileFrame.setVisible(true);
    fileFrame.setTitle("TRIANGLES");
  }
  
}
