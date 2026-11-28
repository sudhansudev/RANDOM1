import java.util.Scanner;
public class input 
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("enter a number for input :");
        int a = obj.nextInt();
        System.out.println("the entered number is : " + a);

        System.out.print("enter a boolean number :");
        boolean b = obj.nextBoolean();
        System.out.println("the entered boolean value is : " + b);

        System.out.print("enter a double number :");
        double d = obj.nextDouble();
        System.out.println("the entered double value is :" +d);

        System.out.print("enter a charecter value :");
        String s = "tyson";
        char c = s.charAt(0);
        System.out.println("the entered charecter is : " + c);
        
       
       
    }    
}
