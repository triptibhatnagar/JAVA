package Day_3.Assignment1;

import java.util.Scanner;

public class Q9 {
    // To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        //153 = 1^3 + 5^3 + 3^3 3:no. of digits
        int sum = 0;
        int digits = 0;
        int ptr = n;
        while(ptr > 0) {
            // int rem = n%10;
            ptr = ptr/10;
            digits++;
        }
        ptr = n;
        System.out.println("No. of digits : "+digits);
        while(ptr > 0) {
            int rem = ptr%10;
            sum += Math.pow(rem, digits);
            ptr = ptr/10;
        }

        if(n == sum) {
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}