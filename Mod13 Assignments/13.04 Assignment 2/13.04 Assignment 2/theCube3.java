/**
 * Cube3 Class
 * 
 *
 * @version 5/5/2007
 */
public class theCube3 extends Box3
{
 // instance variables 
 
 /**
  * Constructor for objects of class cube
  */
 public theCube3(int lwh)
 {
  // initialise instance variables
  super(lwh, lwh, lwh);
 }
    public String toString()
 {
     return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
 }
 