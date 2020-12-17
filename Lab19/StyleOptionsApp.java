/**
 * StyleOptionsApp.java       adapted from Java Foundations
 * Demonstrates the use of check boxes.
 * An application that shows selections of fontstyles and emphases you can apply on a text
 * Edited by Rhea Villafuerte 11/09/2018
 */

import javax.swing.*;

public class StyleOptionsApp
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Style Options");
      frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

      StyleOptionsPanel panel = new StyleOptionsPanel();
      frame.getContentPane().add (panel);

      frame.pack();
      frame.setVisible(true);
   }
}
