/**
 * This class calculates the projectile distance and creates the data table with two accessor methods.
 * 
 * @author Olga Redko
 * @version 01/16/2017
 */
class Catapult
{
    /**
     * Default constructor for objects of type Catapult
     */
    Catapult()
    {
    }
    
    /**
    * Accessor method to calculate the projectile distances (feet). 
    * @param calculations the array.
    * @param rowsLength length of the rows,
    * @param columnsLength length of the columns.
    * @param a angle in degrees.
    * @param v initial velocity in miles per hour.
    * @param g the gravitational acceleration in meters per second per second.
    */
    public static void calcProjectileDistance(Integer[][] calculations, int rowsLength, int columnsLength, int a, int v, double g)
    {
        for(int row = 0; row < rowsLength; row ++)
         {
           for(int col = 0; col < columnsLength; col ++)
           {
              if(col == 0)
              {
                calculations[row][col] = v;
              }
              else
              {
                calculations[row][col] = (int)(3.28084 * Math.pow((v * 0.44704), 2) * Math.sin(2 * Math.toRadians(a)) / g);
                a += 5;
              }
           }
           v += 5;
           a -= 5 * (columnsLength - 1);
        }
    }
    
    /**
    * Accessor method to print the projectile distances. 
    * @param calculations the array.
    * @param rowsLength length of the rows,
    * @param columnsLength length of the columns.
    */
    public static void printProjectileDistance(Integer[][] calculations, int rowsLength, int columnsLength)
    {
        System.out.println("\t\t\t  Projectile Distance (feet)");
        System.out.println("       MPH      25 deg    30 deg    35 deg    40 deg    45 deg    50 deg");
        System.out.println("================================================================================");
        for(int row = 0; row < rowsLength; row ++)
         {
           for(int col = 0; col < columnsLength; col ++)
           {
             System.out.printf("%10d", calculations[row][col]);
           }
           System.out.println();
        }
    }
}    