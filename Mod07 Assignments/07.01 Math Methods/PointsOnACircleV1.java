/**
 * This program determines the x and y values of points on a circle of radius 1.0.
 * 
 * @author Olga Redko
 * @version 11/19/2016
 */
public class PointsOnACircleV1
{
    public static void main(String[ ] args)
    {
        double r = 1;
        double x1 = 1.1;
        double increment = 0.1;
        
        System.out.println("  Points on a Circle of Radius 1.0");
        System.out.printf("%4s%8s%15s%8s\n", "x1","y1", "x1", "y2");
        System.out.println("------------------------------------");
        for(int i = 0; i < 21; i++)
        {
            x1 -= increment;
            double y1Positive = Math.sqrt(r - Math.pow(x1, 2));
            double y1Negative = -Math.sqrt(r - Math.pow(x1, 2));
            System.out.printf("%5.2f%8.2f%15.2f%8.2f\n", x1, y1Positive, x1, y1Negative);
        }
    }
}
