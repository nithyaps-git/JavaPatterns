import java.util.*;
public class SolidRectangle
{
    public static void main(String args[])
    { 
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows and cols respectively");
        int r=scan.nextInt();
        int c=scan.nextInt();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}