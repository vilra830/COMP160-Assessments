/**  
 * Box.java
 * 
 * Lab 7, COMP160  2018
 * 
 * Stores and displays information a Box.
 */

public class Box{
  // Data field Declarations
  private static String owner;
  private int height;
  private int width;
  private int length;
  
  
  /**sets the value of the data field height to input parameter value
    */
  
  public void setHeight(int h){
    height = h;
  }
   /**sets the value of the data field width to input parameter value
    */
  public void setWidth(int w){
    width = w;
  }
   /**sets the value of the data field length to input parameter value
    */
  public void setLength(int l){
    length = l;
  }
  
   /**sets the value of the data field owner to input parameter value
    */
   public static void setOwner(String name){
    owner = name;
  }
  
   
   /**calculates and returns the Surface area of the box
    */
  public int getSurfaceArea(){
    return (2*height*width)+(2*width*length)+(2*height*length);
  }
  
  
   /**calculates and returns the Volune of the box
    */
  public int getVolume(){
    return height*width*length;
  }
  
 
  
   /**displays the owner's name of the box
    */
  public static String getOwner(){
    return owner;
  }
  
  
   /**displays the dimensions, Surface area, volume and owner of the box
    */
  public String toString(){
    return "Height is: " + height+" Length is: " + length + " Width is: " + width +" Volume is: " + getVolume() + " Surface Area is: " +getSurfaceArea()+ ". " + 
      "\n Owned by: "+owner;
  }
  
  
  
  public Box(int h, int w, int l){
    height = h;
    width = w;
    length = l;
  }
  
  public Box(){
  }
  
  public Box(int side){
    height = length = width = side;
  }
  
  
  
}