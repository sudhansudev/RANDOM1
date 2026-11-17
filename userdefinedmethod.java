public class userdefinedmethod 
{
    //static method
    public static void hello()//user-defined method
    {
        System.out.println("this is a use-defined method.");
    }

    //instance method
    void greet()
    {
        System.out.println("this is a instance method.");
    }
    public static void main(String[] args)
    {
        userdefinedmethod obj = new userdefinedmethod();//create object
        obj.greet();

        userdefinedmethod.hello(); //call method using class name
    }
}
