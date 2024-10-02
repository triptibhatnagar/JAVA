package Day_3.Assignment1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        int p = sc.nextInt();
        System.out.print("Enter the time duration in years : ");
        int t = sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        float r = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("Simple Interest : "+si);

        sc.close();
    }
}