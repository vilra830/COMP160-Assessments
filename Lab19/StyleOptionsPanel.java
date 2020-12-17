/**
 * StyleOptionsPanel.java      adapted from Java Foundations
 * Demonstrates the use of check boxes by using Radio buttons and check boxes in selecting fontstyles and emphasis on
 * a certain text.
 * Edited by Rhea Villafuerte 11/09/2018
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  private JRadioButton courier, times, helvetica;
  
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  {
    /**Local variables initisializing datafields*/
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    
    /*shows instance of StyleListener and addition of JCheckBox datafields*/
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    
    
    /**Local variables initisializing datafields*/
    courier = new JRadioButton("Courier");
    courier.setBackground(Color.cyan);
    times = new JRadioButton("Times New Roman");
    times.setBackground(Color.cyan);
    helvetica = new JRadioButton("Helvetica" , true);
    helvetica.setBackground(Color.cyan);
    
    /**groups JRadioButtons*/
    ButtonGroup group = new ButtonGroup();
    group.add(courier);
    group.add(times);
    group.add(helvetica);
    
    /*shows instance of QuoteListener and addition of JRadioButton datafields*/
    QuoteListener listener1 = new QuoteListener();
    courier.addActionListener(listener1);
    times.addActionListener(listener1);
    helvetica.addActionListener(listener1);
    
    /* add the components , dimension and color to this JPanel*/
    setLayout(new GridLayout(6,1,3 ,3));
    add (saying);
    add (bold);
    add (italic);
    add(courier);
    add(times);
    add(helvetica);
    
    
    
    
    
    
    
    
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 300));
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
  
  
  
  /** represents a listener for radiobutton selection */
  private class QuoteListener implements ActionListener{
    
    /**updates the font style of the text*/
    
    public void actionPerformed(ActionEvent event){
      
      Object source = event.getSource();
      
      if (source == courier){
        typeFace = "Courier";
      } else if (source == times){
        typeFace = "Times New Roman";
      } else {
        typeFace = "Helvetica";
      }
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
}




