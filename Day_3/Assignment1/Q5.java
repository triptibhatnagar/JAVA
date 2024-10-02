package Day_3.Assignment1;

import java.util.Scanner;

public class Q5 {
    // Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int max = a;
        if(a < b) {
            max = b;
        }
        System.out.println("Maximum from "+a+" and "+b+" is "+max);

        sc.close();
    }
}