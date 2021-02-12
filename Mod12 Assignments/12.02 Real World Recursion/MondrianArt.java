
/**
 * This class creates Mondrarian Art.
 * 
 * @version 01/21/2017
 */
import java.applet.Applet;
import java.awt.*;
public class MondrianArt extends Applet
{
    public void drawMondrianArt(int x1, int y1, int x2, int y2, Graphics canvas)
    {       
            canvas.drawLine(x1,y1,x2,y1);
            canvas.drawLine(x1,y1,x1,y2);
            canvas.drawLine(x1,y2,x2,y2);
            canvas.drawLine(x2,y1,x2,y2);
            
            drawMondrianArt(x1, y1, x2, y2, canvas);
            
            //drawMondrarianArt((x1+x3)/2, (y1+y3)/2, (x3+x2)/2, (y3+y2)/2, x3, y3, canvas);
    }
    
    public void paint(Graphics g)
    {
        drawMondrianArt(500, 400, 50, 100, g);
        //width, length
    }
}