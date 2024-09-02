import java.util.*;
public class Day
{
    public static void main(String [] args)
    {

        int Day;
        Scanner S = new Scanner(System.in);
        System.out.print(" Enter Day Number:-");
        Day = S.nextInt();

        switch(Day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wedensday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            
        }
    }

}