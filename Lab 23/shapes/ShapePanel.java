/** ShapePanel.java Lab 21
  a GUI application class which adds different shapes 
  * to a random location on a panel at the click of the corresponding button. Upto 20 different shapes maybe drawn.
  * Coded by: Rhea VIllafuerte 27/09/20198
  */

package shapes;
import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.Timer;


public class ShapePanel extends JPanel{
  private JPanel controlPanel = new JPanel();
  private JButton[] buttons = {new JButton("Circle"),new JButton("Square"),new JButton("Oval"),
    new JButton("Smiley"),new JButton("Swirl"),new JButton("Start"),new JButton("Stop"),
    new JButton("Wheel")};;
  
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count");
  private DrawingPanel drawPanel = new DrawingPanel();
  private Shape[] shapes = new Shape [20];
  private int count;
  private Timer timer;
  private final int DELAY = 10;
  
  
  /**constructor that sets up the panels and listeners*/
  public ShapePanel(){
    
    
    // set up control panel
    add(controlPanel);
    ButtonListener b = new ButtonListener();
    timer = new Timer(DELAY, b);
    controlPanel.setPreferredSize(new Dimension (100, 400));
    for(JButton button: buttons){
      controlPanel.add( button);
      button.addActionListener(b);
    }
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    
    
    
    //set up draw panel
    add(drawPanel);
    drawPanel.setPreferredSize(new Dimension (400, 400));
    drawPanel.setBackground(Color.pink);
    add(controlPanel, BorderLayout.WEST);
    add(drawPanel, BorderLayout.EAST);
    
    
  }
  
  /**each shape will draw itself*/
  private class DrawingPanel extends JPanel{
    
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      
      for(int i = 0; i < count; i++){
        shapes[i].display(page);
      } 
      
    }  
  }
  /** Listener - Conditional for button pressed by user; a pressed button will generate a shape 
    * according to its name in a random location and some with a random size. upto 20 shapes may be drawn.
    */ 
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      
      
      
      
      
      if (e.getSource() == timer){
        for(int i = 0 ; i < count ; i++){
          shapes[i].move();
        }} else {
          JButton button = (JButton) e.getSource();
          if (button.getText().equals("Circle")){
            shapes[count] = new Circle(); 
            count++;
            showNum.setText(Integer.toString(count));
          } else if (button.getText().equals("Square")){
            shapes[count] = new Square(); 
            count++;
            showNum.setText(Integer.toString(count));
          } else if(button.getText().equals("Oval")){
            shapes[count] = new Oval(); 
            count++;
            showNum.setText(Integer.toString(count));
          } else if (button.getText().equals("Smiley")){
            shapes[count] = new Smiley(); 
            count++;
            showNum.setText(Integer.toString(count));
          } else if (button.getText().equals("Swirl")){
            shapes[count] = new Swirl(); 
            count++;
            showNum.setText(Integer.toString(count));
          } else if (button.getText().equals("Start")){
            timer.start();
          } else if(button.getText().equals("Stop")){
            timer.stop();
            
            
            
          }
        }
        repaint();
    }
    
  }
}




