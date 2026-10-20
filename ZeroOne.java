import java.util.*;
public class ZeroOne
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=scan.nextInt();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}