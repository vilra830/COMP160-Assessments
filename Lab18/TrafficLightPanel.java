import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** This class represents 3 datafields of type JButton that are labeled according to the colors of the traffic light 
  * and 3 unlit circles. Once a user presses any of those buttons , corresponding color of light will show.
  */



public class TrafficLightPanel extends JPanel{
  JButton redButton = new JButton("Red");
  JButton greenButton = new JButton("Green");
  JButton amberButton = new JButton("Amber");
  JLabel lastPressedLabel = new JLabel("last pressed");
  JPanel buttonPanel = new JPanel();
  
  
  
  /**Constructor that creates instances of ButtonListener and LightPanel
    * sets the size and the colors ; and add the buttons to the panels (TrafficLightPanel , buttonPanel and LigthPanel)
    */
  
  public TrafficLightPanel(){
    
    ButtonListener bl = new ButtonListener();
    redButton.addActionListener(bl);
    greenButton.addActionListener(bl);
    amberButton.addActionListener(bl);
    
    
    
    setPreferredSize(new Dimension(200,300));
    setBackground(Color.blue);
    
    add(buttonPanel);
    
    buttonPanel.setPreferredSize(new Dimension(80,290));
    buttonPanel.setBackground(Color.white);
    
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
   
    
    LightPanel b = new LightPanel();
    add(b);
    
    
    
  }
  /** Changes the color of the buttonPanel when a button is pressed.*/
  
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed (ActionEvent event){
      JButton source = (JButton) event.getSource();
      if (event.getSource() == redButton){ // display next team
        lastPressedLabel.setText("Red");
        buttonPanel.setBackground(Color.red);
        
        
      } else if (event.getSource() == amberButton){
        lastPressedLabel.setText("Amber");
        buttonPanel.setBackground(Color.orange);
        
        
      } else if (event.getSource() == greenButton){ // reset display
        lastPressedLabel.setText("Green");
        buttonPanel.setBackground(Color.green);
      }
      repaint();
    }
    
  }
  
  
  /** Creates another frame called LightPanel to contain the lights*/
  private class LightPanel extends JPanel {
    
    
    /**Draws the circle of lights and lights the corresponding color of the button being pressed*/  
    
    public void paintComponent (Graphics g){
      super.paintComponent(g);
      
      g.setColor(Color.black);
      g.fillOval(20, 30 , 40 , 40);
      g.fillOval(20, 150 , 40 , 40);
      
      g.fillOval(20, 90 , 40 , 40);
      
      if (lastPressedLabel.getText().equals("Red")){
        g.setColor(Color.red);
        g.fillOval(20, 30 , 40 , 40);
        
      } else if (lastPressedLabel.getText() .equals("Amber")){
        g.setColor(Color.orange);
        g.fillOval(20, 90 , 40 , 40);
        
        
      } else if (lastPressedLabel.getText().equals("Green")){
        g.setColor(Color.green);
        g.fillOval(20, 150 , 40 , 40);
    }
    }
    
    /**Constructor that creates the dimension and the background color of the LightPanel*/
    
    public LightPanel(){
      setPreferredSize(new Dimension(80,290));
      setBackground(Color.cyan);
      
    }
  }
}