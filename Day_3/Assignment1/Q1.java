package Day_3.Assignment1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

        sc.close();
    }
}