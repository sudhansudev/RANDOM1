public class swapping
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("before swapping , a =" + a + " & b =" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping , a =" + a + " & b =" + b);
    }
}