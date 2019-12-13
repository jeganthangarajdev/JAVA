import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("enter a");
        x=in.nextInt();
        if(x%4==0)
{
    System.out.print("leap year");
}
else
{
    System.out.print("not leap year");
}}}

