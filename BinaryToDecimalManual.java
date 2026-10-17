import java.util.Scanner;
public class BinaryToDecimalManual {
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        num = sc.nextInt();
        if(num == 0)
            System.out.println("enter a valid number ."); 
        else
        {
            int[] binary = new int[32];
            int i = 0;
            while(num > 0)
            {
                binary[i] = num % 2;
                num = num / 2;
                i++;
            }
            System.out.println("show the binary no of given decimal no .");

            for (int j = i - 1; j >= 0; j--) 
            {
                System.out.println("binary num =" + binary[i]);
            }
        }  
    }
}