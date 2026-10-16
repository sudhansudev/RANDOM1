public class concat {
    public static void main(String [] args)
    {
        String n1 = "tyson";
        String n2 = "tyson";
        // String ct = n1.concat(n2);
        // System.out.println(ct);
         System.out.println(n1 == n2);
         System.out.println(n1.equals(n2));
        String st1 = new String("tyson");
        String st2 = new String("tyson");
        

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
        System.out.println(st1.length());
        System.out.println(st1.append("ty"));
    }  
}
