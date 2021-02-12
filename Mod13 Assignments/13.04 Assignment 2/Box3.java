/**
 * Box3 demo.
 * 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
 // instance variables 
 private int height;

 /**
  * Constructor for objects of class box
  */
 public Box3(int l, int w, int h)
 {
  // call superclass
  super(l, w);
     // initialise instance variables
  height = h;
 }

 // return the height
 public int getHeight()
 {
  return height;
 }
 
 public String toString()
 {
     return "Box - " + getLength() + " X " + getWidth() + " X " + height;
 }
 public boolean equals(Object b)
 {
    if ( ! (b instanceof Box3) )
            return false;
      Box3 t = (Box3)b;
      return t.getLength() == getLength() && t.getWidth() == getWidth() && t.getHeight() == getHeight();
    }

}