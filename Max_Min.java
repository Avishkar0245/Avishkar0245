import java.util.*;
public class Max_Min
{
    public static void main(String [] args)
    {
        int Value1;
        Scanner S = new Scanner(System.in);
        System.out.print(" Enter First Number:-");
        Value1 = S.nextInt();

        int Value2;
        Scanner f = new Scanner(System.in);
        System.out.print(" Enter Second Number:-");
        Value2 = f.nextInt();

        if(Value1>Value2)
        {
            System.out.println("Maximum Number");
        }
        else
        {
            System.out.println("Minimum Number");
        }
    }
}