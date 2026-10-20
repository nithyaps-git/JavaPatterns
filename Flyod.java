import java.util.*;
public class Flyod
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r=scan.nextInt();
        int number=1;
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
}
