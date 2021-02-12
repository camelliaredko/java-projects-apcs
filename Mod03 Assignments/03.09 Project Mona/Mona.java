/**
 * Mona calculates fines on overdue books for the CSA Media Center.
 * 
 * @author Olga Redko
 * @version 10/2/2016
 */
import java.util.Scanner;
public class Mona
{
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name (Last, First): ");
        String lastName = in.next();
        String firstName = in.nextLine();
        System.out.println("");
        
        System.out.print("Enter the phone number (###) ###-####: ");
        String phoneNumber = in.next();
        phoneNumber += in.nextLine();
        System.out.println("");
        
        System.out.print("Enter the title of the book: ");
        String bookName = in.next();
        bookName += in.nextLine();
        System.out.println("");
        
        System.out.print("Enter the date checked out mm/dd/yyyy: ");
        String date = in.next();
        System.out.println("");
        
        String daysLate = "6";
        System.out.println("Days late: " + daysLate);
        String dailyFine = ".24";
        System.out.println("Daily fine: " + dailyFine);
        System.out.print("\n\n\n");
        
        System.out.println("---------- Text for email message ----------\n\n");
        System.out.print("To: " + firstName + " " + lastName.substring(0, (lastName.length() - 1)));
        String lowercaseFirstName = firstName.toLowerCase();
        String lowercaseLastName = lastName.toLowerCase();
        System.out.println(" (" + lowercaseFirstName.substring(1, 4) + lowercaseLastName.substring(0, 3) + phoneNumber.substring(6, 9) + "@csamediacenter.com)\n");
        System.out.println("From: Mona (mona@csamediacenter.com)");
        System.out.println("");
        System.out.println("Subject: Overdue Book Notice");
        System.out.println("===================================================");
        System.out.println(bookName + " was checked out on: " + date.substring(0, 2) + "-" + date.substring(3, 5) + "-" + date.substring(6));
        System.out.println("This book is currently " + daysLate + " day(s) late.");
        System.out.println("Your fine has accumulated to: $" + Integer.parseInt(daysLate) * Double.parseDouble(dailyFine) + " dollar(s)");

    }//end of main method
}//end of class
