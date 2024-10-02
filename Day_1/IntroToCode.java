package Day_1;

import java.util.Scanner;

public class IntroToCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
        int n = sc.nextInt();
        System.out.println(n);
        sc.close();
    }
}