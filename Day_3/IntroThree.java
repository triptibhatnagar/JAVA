package Day_3;

import java.util.Scanner;

public class IntroThree {
    public static void main(String[] args) {
        /*
         * Comments - ignored by the compiler
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int rollNo = sc.nextInt();
        System.out.println("Roll no. : "+rollNo);

        int a = 10; //literals - syntactical representation of boolean, numeric, or string data
        //a(reference variable) - identifier
        //IntroThree, main,Day_3 - identifiers

        int b = 234_000_000;
        System.out.println(b);

        String name = sc.next();
        System.out.println(name);

        float marks = sc.nextFloat();
        System.out.println(marks);
        //i/p - 709790.879
        //o/p - 709790.9

        //sum of two numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum: "+sum);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float sum2 = n1+n2;
        System.out.println("Sum: "+sum2);

        
    }
}
