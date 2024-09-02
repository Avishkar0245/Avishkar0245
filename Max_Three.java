import java.util.*;
public class Max_Three
{
    public static void main(String [] args)
    {
        int No1;
        Scanner S = new Scanner(System.in);
        System.out.print(" Enter First Number:-");
        No1 = S.nextInt();

        int No2;
        Scanner f = new Scanner(System.in);
        System.out.print(" Enter Second Number:-");
        No2 = f.nextInt();

        int No3;
        Scanner r = new Scanner(System.in);
        System.out.print(" Enter Third Number:-");
        No3 = r.nextInt();


        if(No1>No2 || No1>No3 || No2>No3 || No2>No3)
        {
            System.out.println("Maximum Number");
        }
        else
        {
            System.out.println("Minimum Number");
        }
    
        
    }
}