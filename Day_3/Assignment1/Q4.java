package Day_3.Assignment1;

import java.util.Scanner;

public class Q4 {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /) : ");
        char op = sc.next().trim().charAt(0);

        if(op == '+') {
            int ans = a+b;
            System.out.println("Addition : "+ans);
        }else if(op == '-') {
            int ans = a-b;
            System.out.println("Subtraction : "+ans);
        }else if(op == '*') {
            int ans = a*b;
            System.out.println("Multiplication : "+ans);
        }else if(op == '/') {
            if(b != 0) {
                int ans = a/b;
                System.out.println("Division : "+ans);
            }else {
                System.out.println("Not defined");
            }
        }else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}