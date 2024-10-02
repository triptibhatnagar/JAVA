package Day_2;

import java.util.Scanner;

public class IntroTwo {
    public static void main(String[] args) {
        System.out.println("Hey");
        System.out.println(123);

        /*
         * PrintStream - adds the functionality  to another output stream, namely the ability to print representation of various data values conveniently.
         * out - variable of type printstream(class)
         * println - method of type printscreen
         * print - not add new line
         * println - add new line
         * System.out - standard output stream
         * out - by default, it is commandline
         */

         Scanner sc = new Scanner(System.in);
         System.out.println(sc.nextLine());
         sc.close();
         /* INPUT
          * import java.util.Scanner 
          * Scanner - class which parse primitive types and strings using regular expressions (allows to take input)
          * System.in - from where we are taking the input (from keyboard), sandard input stream
          * (System.in) - constructor which is initializing the object
          * Every clas extends object in java
          */

          //PRIMITIVES
          /*
           * int
           */

           int rollNo = 123;
           //primitve datetype : any datatype that you cannot break further

           //String is not primitve
           String name = "ABCD";
           System.out.println(name+" "+rollNo);
        //    //char is primitive
        //     char ch = 't';
        //     float marks = 78.90f;
        //     double largeDecNum = 863686816.6758;
        //     long largeIntVal = 686896896986987897L;
        //     boolean isLogIn = true;

            /*
             * decimal values -> type is double, but to make float, add F.
             * same as in long
             * there exists classes for primtive datatypes as well
             * Eg - Integer
             * These are wrapper classes.
             * these classes add some more functionalities to the primtives.
             */
    }
}