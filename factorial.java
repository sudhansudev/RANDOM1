import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args)
    {
        System.out.print("enter a number :");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int fact = 1;
        for(int i = 1; i <= num;i++)
        {
            fact = fact * i;
        }
        System.out.println("factorial of the number is = " + fact);
    }   
}
