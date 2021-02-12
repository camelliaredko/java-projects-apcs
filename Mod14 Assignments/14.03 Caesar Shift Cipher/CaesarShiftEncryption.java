/**
 * This program encrypts and decrypts messages via the Caesar Shift algorithm.
 * 
 * @author Olga Redko
 * @version 03/08/2017
 */
import java.util.Scanner;
public class CaesarShiftEncryption
{
    public final int SHIFTKEY = 0;
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public static String shiftAlphabet(int shift)
    {
       String shiftedAlphabet = "";
       for(int i = 0; i < ALPHABET.length(); i++)
       {
            if(Character.getNumericValue(ALPHABET.charAt(i)) + shift >= 10 && Character.getNumericValue(ALPHABET.charAt(i)) + shift <= 35)
            {
                shiftedAlphabet += String.valueOf(Character.toChars(Character.getNumericValue(ALPHABET.charAt(i)) + shift + 87));
            }
            else
            {
                shiftedAlphabet += String.valueOf(Character.toChars(Character.getNumericValue(ALPHABET.charAt(i)) + shift + 87 - 26));
            }
       }
       return shiftedAlphabet;
    }
    
    public static String encryptionShifter(int shift, String message)
    {
       String encryptedMessage = "";
        
       for(int i = 0; i < message.length(); i++)
       {
           if(Character.getNumericValue(message.charAt(i)) == -1)
           {
               encryptedMessage += " ";
           } 
           else if(Character.getNumericValue(message.charAt(i)) + shift >= 10 && Character.getNumericValue(message.charAt(i)) + shift <= 35)
           {
               encryptedMessage += String.valueOf(Character.toChars(Character.getNumericValue(message.charAt(i)) + shift + 87));
           }
           else
           {
               encryptedMessage += String.valueOf(Character.toChars(Character.getNumericValue(message.charAt(i)) + shift + 87 - 26));
           }
       }
       return encryptedMessage;
    }

    public static void caesarShiftEncryptor()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message you would like to encrypt. Enter \"Q\" to quit.");
        String userMessage = in.nextLine();
        System.out.println("Now enter the shift key value (0-25).");
        int SHIFTKEY = in.nextInt();
        String shiftedMessage = encryptionShifter(SHIFTKEY, userMessage);
        String cipherAlphabet = shiftAlphabet(SHIFTKEY);
            
        System.out.println("The encrypted message is " + shiftedMessage);
        System.out.println("The cipher alphabet is " + cipherAlphabet);
    }
}