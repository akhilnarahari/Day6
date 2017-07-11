/**
 * Created by narahara on 7/11/2017.
 */

public class AutoBoxing {
    public static void main(String args[])
    {
        //auto boxing, automatically converts int to Integer
        Integer iObj = 10;

        Integer iObj1 = new Integer(20);

        //auto unboxing, automatically converts
        int i = iObj1;
        display(1.1f, 2.2f);
    }
    static void display(Float val1, Float val2)
    {
        System.out.println("Display(): "+val1+" "+val2);
    }
}

