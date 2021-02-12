/**
 * Box3
 * 
 * @author R. Enger, modified by Olga Redko
 * @version 2/21/2017
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
        return "Box - " + super.getLength() + " X " + super.getWidth() + " X " + height;
    }
    
    public boolean equals(Object b) 
    { 
      if (!(b instanceof Box3)) 
      {
         return false;
      }
      else
      {
         Box3 t = (Box3)b;
         return t.getLength() == getLength() && t.getWidth() == getWidth() && t.getHeight() == getHeight();
      }
    }
}