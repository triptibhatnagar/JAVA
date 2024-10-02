package Day_3.Assignment1;

import java.util.Scanner;

public class Q2 {
    // Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String msg = "Hello "+name;
        System.out.println(msg);

        sc.close();
    }
}