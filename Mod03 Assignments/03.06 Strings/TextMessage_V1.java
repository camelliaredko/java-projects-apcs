/**
 * This program replaces phrases in messages with standard cell phone text abbreviations.
 *
 * @author Olga Redko
 * @version 09/24/2016
 */
public class TextMessage_V1
{
    public static void main(String [ ] args)
    {
        //information about the original message
        String originalMessage = "oh my gosh i've really got to go to you";
        int originalMessagelength = originalMessage.length();
        System.out.println("Original Message:");
        System.out.println(originalMessage);
        System.out.println("message length: " + originalMessagelength + " characters");
        System.out.println();
        
        //replace characters within the String object
        String newMessage = originalMessage.replace("oh my gosh", "omg");
        newMessage = newMessage.replace("really", "RLY");
        newMessage = newMessage.replace("got to go", "gtg");
        newMessage = newMessage.replace("to", "2");
        newMessage = newMessage.replace("you", "u");
        int newMessagelength = newMessage.length();
        System.out.println("New message: ");
        System.out.println(newMessage);
        System.out.println("message length: " + newMessagelength + " characters");
        System.out.println();
        
        //String method examples
        System.out.println("String method samples: ");
        System.out.println("index of \"2\":\t\t\t\t\t" + newMessage.indexOf("2"));
        int fourthofnewMessage = newMessage.length()/4;
        System.out.println("substring (two parameters) third fourth:\t" + newMessage.substring(fourthofnewMessage * 2, fourthofnewMessage * 3));
        System.out.println("substring (one parameter) last fourth:\t\t" + newMessage.substring(fourthofnewMessage * 3));
        System.out.println("replaceAll UI's:\t\t\t\t" + newMessage.replaceAll("[ui]", "me"));
        
    }
} 
