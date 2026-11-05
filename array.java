import java.util.Scanner;
public class array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter "+ size +"elements of array :");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("the elements are :");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("[" + i + "]" + " -> " + arr[i]);
        }
    }
}
