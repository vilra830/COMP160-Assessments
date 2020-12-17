

import javax.swing.*;




/** This application demonstrates the traffic lights on default color (black) and 3 color labeled buttons beside them
  * Once any of the buttons pressed,the correspoding light lights up. 
  * Coded by: Rhea Vilafuerte 10/09/2018
  */
public class TrafficLightPanelApp{
  /** creates  an instance of the TrafficLightPanel class*/
  public static void main(String[]args){
    JFrame frame = new JFrame("Traffic Light Panel"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TrafficLightPanel traffic = new TrafficLightPanel();
    frame.getContentPane().add (traffic);
    frame.pack();
    frame.setVisible(true);
  }
}

