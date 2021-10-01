package practice_questions1;

import java.util.ArrayList;
import java.util.Scanner;

public class InstanceCheck {
    public static void main(String[] args) {
/*
        Integer in = new Integer(234);
        System.out.println("string " instanceof String);
        System.out.println(in instanceof Integer);

        StringBuffer n = new StringBuffer("abcd");
        StringBuffer a = n.append(" added 1 time");
        n = n.append("added 2 time");
        System.out.println(n + "\n"+ a);
        System.out.println(n==a);
        System.out.println(n.equals(a));

 */

/*
        String n = "rishabh";
        String a = "rishabh";
        System.out.println(n==a);
        System.out.println(n.equals(a));

 */
        /*
        ArrayList<Integer> n = new ArrayList<Integer>();
        System.out.println("a" + 1);
//        System.out.println(n + new int[2]);     it will not work because "+" operator is not applicable on complex datatypes
        System.out.println(n + " " + new int[2]); //addition takes place only on primitive datatypes, on complex datatypes
                                                  // we need to add atleast one string to concatenate those datatypes.
         */
/*
        String a = new String("hello");
        System.out.println(a.hashCode());
        var b = a;
        a = "new hello";
        System.out.println(a + " " + b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
 */
        /*
        StringBuffer a = new StringBuffer("hello");
        System.out.println(a.hashCode());
        a = a.append(" hey");
        System.out.println(a.hashCode());
         */

        /*
        String n = null;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        if (n == null || n.length() == 0){    //null will be written first because if it is not checked first it will give an error
            System.out.println("it is empty");
        }
        else System.out.println("not empty");
         */


    }
}
