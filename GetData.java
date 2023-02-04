//program to input string, int and float.
import java.util.Scanner;

public class GetData
{
   public static void main(String args[])
   {
      String hours, minutes;
      int seconds;
            
      Scanner SC=new Scanner(System.in);
      
      System.out.print("Enter Hours: ");
      hours=SC.nextLine();
      
      System.out.print("Enter Minutes: ");
      minutes=SC.next();
      
      System.out.print("Enter Seconds: ");
      seconds=SC.nextInt();
      
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
      
      }
}