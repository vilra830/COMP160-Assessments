import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

/** ShapePanel.java Lab 21
  * a GUI class which adds a coloured circle of random size
  * to a random location on a panel at the click of a button. Upto 20 circles maybe drawn.
  * Coded by: Rhea VIllafuerte 20/09/2019
  */

public class ShapePanel extends JPanel{
  private JPanel controlPanel = new JPanel();
  private JButton addShape = new JButton("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count");
  private DrawingPanel drawPanel = new DrawingPanel();
  private Shape[] shapes = new Shape [20];
  private int count;
  
  /**constructor that sets up the panels and listeners*/
  public ShapePanel(){

    // set up control panel
    add(controlPanel);
    controlPanel.setPreferredSize(new Dimension (100, 400));
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    ButtonListener b = new ButtonListener();
    addShape.addActionListener(b);

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
/** Listener - Conditional for button pressed by user; Pressed button generate a colored circle
  * with a random size and location . upto 20 circles may be drawn.
  */ 
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      
      if (e.getSource().equals(addShape) && count < shapes.length){
        shapes[count] = new Shape();  
        count++;
        // displays the current count of shape shown
        
        showNum.setText(Integer.toString(count));      
        repaint();
        
      }
      
    }
  }
}


