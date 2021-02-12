
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 16;
        
        // Addition
        System.out.println("Addition");
        System.out.print( iNum1 + " plus " + iNum2 + " equals " );
        System.out.println( iNum1 + iNum2 );
        System.out.println( "43.21 plus 3.14 plus 5.0 equals " + (43.21 + 3.14 + 5.0));
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( iNum3 + " minus " + iNum2 + "minus" + iNum1 + " equals " );
        System.out.println( iNum3 - iNum2 - iNum1 );
        System.out.println("3.14 minus 5.0 equals " + (3.14 - 5.0));
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print( iNum1 + " times " + iNum2 + " equals " );
        System.out.println( iNum1 * iNum2 );
        System.out.println("3.14 times 5.0 times 5.0 equals " + (3.14 * 5.0 * 5.0));
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print( iNum2 + " divided by " + iNum1 + " equals " );
        System.out.println( iNum2 / iNum1 );
        System.out.println("43.21 divided by 5.0 equals " + (43.21 / 5.0));
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum3 + " modulus " + iNum2 + " equals " );
        System.out.println( iNum3 % iNum2 );
        System.out.println("5.0 modulus 3.14 equals " + (5.0 % 3.14));
        //System.out.println();
        
        //My arithmetic expressions
        System.out.println("My arithmetic expressions");
        System.out.print( iNum1 + " modulus " + iNum2 + " divided by " + iNum1 + " minus " + iNum3 + " equals " );
        System.out.println( iNum1 % iNum2 / iNum1 - iNum3 );
        System.out.print( iNum3 + " plus " + iNum1 + " times " + iNum2 + " minus " + iNum1 + " equals " );
        System.out.println( iNum3 + iNum1 * iNum2 - iNum1 );
        //System.out.println();
        
        // 2.02 Lab Equations
        System.out.println("2.02 Lab Equations");
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5 equals " + (15/2.5*-2+10/5));
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3 equals " + (234-(234/6%12)+3));
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals " + ((46.2/11)-3+24%(17-2*3)));
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 equals " + (480/10/12+200*.5-20%8));
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
               
    } // end of main method
} // end of class
