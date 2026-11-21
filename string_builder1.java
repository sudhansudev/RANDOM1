import java.util.*;
public class string_builder1 
{
    public static void main(String[] args)
    {
        // StringBuilder sb = new StringBuilder();
        // sb.append("abc");

        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder();
        String s = "abc";
        StringBuilder sb1 = new StringBuilder(s);

        StringBuilder sb2 = new StringBuilder(20);
        
        System.out.println(sb.length());// 0

        System.out.println(sb.capacity());// 16

        System.out.println(sb1.length());// 3

        System.out.println(sb1.capacity());// 16 + 3(string length) = 19

        System.out.println(sb2.length());// 0

        System.out.println(sb2.capacity());// 20




    }   
}
