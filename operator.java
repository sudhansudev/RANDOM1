public class operator
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
        boolean c = true;
        int d = 12;
        a = -(a);
        System.out.println("a = " + a);
        b = +(b);
        System.out.println("b = " + b);
        a = (++a) + (a++);
        System.out.println("a = " + a);
        b = (b--) + (--b);
        System.out.println("b = " + b);
        c = !c;
        System.out.println("c =" + c);
        d = ~(d);
        System.out.println("d = " + d);
    }
}