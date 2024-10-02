package Day_3.Assignment1;

import java.util.Scanner;

public class Q7 {
    // To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series :-");
        System.out.print(a+" ");
        for (int i = 2; i <= n; i++) {
            int temp = a+b;
            b = a;
            a = temp;
            System.out.print(temp+" ");
        }

        sc.close();
    }
}