import java.awt.*;
import javax.swing.*;
import java.util.Scanner;


/** FilePanel.java
  * Lab 20, COMP160,  2018
  * a JPanel which creates 3 instances of Triangles objects, 
  * stores them in an array and draw graphical Triangle objects with names and perimeter
  * Coded by Rhea Villafuerte 03/10/2018
  */
public class TrianglePanel extends JPanel{
  private Triangle[] drawObjects = {new Triangle (45,30,45,160,150,85, "Rhea" ) , new Triangle(225,55,220,155,290,150,"Summer"), 
    new Triangle(220,165,75,285,225,240,"Sunshine")};
  private int count;
  private DrawingPanel drawPanel = new DrawingPanel();
  private JLabel x = new JLabel("                                                         x                                        ");
  private JLabel y = new JLabel("     y     ");
  private JLabel w = new JLabel("     ");
  private JLabel z = new JLabel("                                                                                                 ");
  private  int dimensionWidth = 360;
  private int dimensionHeight =  360;
  
  /**Constructor of the TrianglePanel, adds the drawingpanel, sets the layout */
  
  public TrianglePanel() {  
    
    
    setLayout(new BorderLayout(5,5));
    setPreferredSize(new Dimension(500,500));
    setBackground(Color.white);
    
    add(drawPanel);
    drawPanel.setPreferredSize(new Dimension (dimensionWidth, dimensionHeight));
    drawPanel.setBackground(Color.white);
    add(drawPanel, BorderLayout.CENTER);
    
    
    add(x, BorderLayout.NORTH);
    x.setPreferredSize(new Dimension (500, 50));
    x.setBackground(Color.white);
    
    
    
    add(y, BorderLayout.WEST);
    y.setPreferredSize(new Dimension (50, 500));
    y.setBackground(Color.white);
    
    
    add(w, BorderLayout.EAST);
    w.setPreferredSize(new Dimension (50, 500));
    w.setBackground(Color.white);
    
    
    
    add(z, BorderLayout.SOUTH);
    z.setPreferredSize(new Dimension (500, 50));
    z.setBackground(Color.white);
  }
  
  
  
  /** paints the triangle in the drawing panel */
  private class DrawingPanel extends JPanel{
    public void paintComponent(Graphics g){
      
      super.paintComponent(g);
      int width=20;
      int height=20;    
      
      
      
      for(int i = 0 ;  i <dimensionWidth;  i+=20){
        g.setFont(new Font("Courier", Font.PLAIN, 10));
        g.drawString(Integer.toString(i), i , 10);
      }
      
      for(int i = 0 ;  i <dimensionHeight ;  i+=20){
        g.setFont(new Font("Courier", Font.PLAIN, 10));
        g.drawString(Integer.toString(i), 0 , i);
      }
      
      for(int x=0; x<dimensionWidth; x++){
        
        for(int y=0; y<dimensionHeight; y++)
        {
          g.setColor(Color.black);
          
          g.drawRect(x*width,y*height,width,height);
          
          
        }
        
      }
      
      
      for(int i = 0 ;  i <drawObjects.length ;  i++){
        drawObjects[i].draw(g);
        
      }
    } 
  }
  
  
  
} 
