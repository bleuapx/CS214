//program to hours, minutes, and seconds to total seconds
import java.util.Scanner;

public class Seconds
{
   public static void main(String args[])
   {
      final int SECONDS_PER_HOUR = 3600;
      final int SECONDS_PER_MINUTE = 60;
      int hours, minutes, seconds, totalSeconds;
            
      Scanner SC=new Scanner(System.in);
      
      System.out.print("Enter Hours: ");
      hours=SC.nextInt();
      
      System.out.print("Enter Minutes: ");
      minutes=SC.nextInt();
      
      System.out.print("Enter Seconds: ");
      seconds=SC.nextInt();
      
      totalSeconds = hours * SECONDS_PER_HOUR + minutes * SECONDS_PER_MINUTE + seconds;

      System.out.println("Total Seconds: " + totalSeconds);
      
      }
}