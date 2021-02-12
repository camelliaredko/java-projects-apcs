/**
 * This class tests the Catapult class, and it calls the 
 * calcProjectileDistance(Integer[][] calculations, int rowsLength, int columnsLength, int a, int v, double g) and 
 * printProjectileDistance(Integer[][] calculations, int rowsLength, int columnsLength) methods. 
 * 
 * @author Olga Redko
 * @version 01/16/2017
 */
public class CatapultTester
{   
    static final int ROWS = 7;
    static final int COLS = 7;
    public static void main(String[] args)
    {
        //declaration and initialization of variables
        Integer[][] values = new Integer[ROWS][COLS];
        int angle = 25;
        int initialVelocity = 20;
        double gravity = 9.8;
        
        //invoke default constructor
        Catapult catapults = new Catapult();

        //call methods
        catapults.calcProjectileDistance(values, ROWS, COLS, angle, initialVelocity, gravity);
        catapults.printProjectileDistance(values, ROWS, COLS);
    }
}