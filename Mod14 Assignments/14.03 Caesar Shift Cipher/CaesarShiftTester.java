/**
 * This program encrypts and decrypts messages via the Caesar Shift algorithm.
 * 
 * @author Olga Redko
 * @version 03/08/2017
 */
import java.util.Scanner;
public class CaesarShiftTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);               
        System.out.print("Press \"E\" to encrypt a message, \"D\" to decrypt a message, or \"Q\" to quit.");
        System.out.println();
        String selectedOption = in.nextLine();
        
        if(selectedOption.equalsIgnoreCase("E"))
        {
            CaesarShiftEncryption.caesarShiftEncryptor();
            CaesarShiftTester.main(args);
        }
        else if(selectedOption.equalsIgnoreCase("D"))
        {
            CaesarShiftDecryption.caesarShiftDecryptor();
            CaesarShiftTester.main(args);
        }
        else if(selectedOption.equalsIgnoreCase("Q"))
        {
            System.out.println("Thank you for using this program.");
        }
        else
        {
            System.out.println(selectedOption + " is not a valid option!");
            CaesarShiftTester.main(args);
        }
    }
}
