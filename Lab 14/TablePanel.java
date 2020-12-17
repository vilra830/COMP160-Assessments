import javax.swing.*;
import java.awt.*;
/** This class creates 6 diner objects and calls their draw method as well as drawing the JPanel 
 *  and the rectangle representing the table
 */
public class TablePanel extends JPanel{
  
  private Diner diner1 , diner2 , diner3 , diner4, diner5 , diner6 ;
  
  public TablePanel(){ // Creates the 6 diner objects 
  
  diner1 = new Diner(100 , 60 , "Caleb" , Color.cyan , 1 );
  diner2 = new Diner(160, 120 , "Georgia" , Color.pink , 2 );
  diner3 = new Diner(160 , 180 , "Maala" , Color.cyan , 3 );
  diner4 = new Diner(100 , 230 , "Bic" , Color.pink, 4 );
  diner5 = new Diner(40 , 180 , "Kings" , Color.cyan , 5 );
  diner6 = new Diner(40 , 120 , "Lorde" , Color.pink , 6 ) ; 
  
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /** Draws this panel by requesting that each diner draws itself*/
  public void paintComponent (Graphics g){
    
    super.paintComponent(g);
    
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor(Color.black);
    g.fillRect (100, 120, 50, 100); 
    
  }
}