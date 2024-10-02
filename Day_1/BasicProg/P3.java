package Day_1.BasicProg;

import java.util.Scanner;

public class P3 {
    //Input a number and print whether it is prime or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Not a prime number");
            return;
        }
        if(n == 0 || n == 1) {
            System.out.println("Neither prime nor composite");
            return;
        } 
        int i = 2;
        while(i*i <= n) {
            if(n%i == 0) {
                System.out.println("Not a prime number");
                return;
            }
            i++;
        }
        if (i * i > n) {
            System.out.println("Prime number");
        }
        sc.close();
    }  
}