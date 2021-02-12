/* 
 * Rectangle 3 demo program
 * 
 * 
 */
public class theRectangle3
{
 // instance variables 
 private int length;
 private int width;

 /**
  * Constructor for objects of class rectangle
  */
 public theRectangle3(int l, int w)
 {
  // initialise instance variables
  length = l;
  width = w;
 }

 // return the height
 public int getLength()
 {
  return length;
 }
 public int getWidth()
 {
     return width;
 }
 
 public String toString()
 {
     return "Rectangle - " + length + " X " + width;
 }
 public boolean equals(Object r)
 {
    if ( ! (r instanceof theRectangle3) )
            return false;
      Rectangle3 t = (Rectangle3)r;
      return t.getLength() == getLength() && t.getWidth() == getWidth();
    }