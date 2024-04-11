import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class TimeStampOperation {
    public static void main(String [] args) throws ParseException{
        long a;
        Scanner sc = new Scanner(System.in);
        //Fetch current timestamp
        a= System.currentTimeMillis();
        System.out.println("The current timestamp is:" +a);
        //Convert timestamp to DATE
        System.out.println("Enter a number: " + new Date(a));
        //Convert DATE to timestamp
        a= new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
                .parse("10/01/1998 17:30:00").getTime();
        System.out.println("The converted timestamp is: " +a);
        System.out.println("Your entered DATE: " + new Date(a));
    }
}
