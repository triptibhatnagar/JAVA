package Day_3.Assignment1;

import java.util.Scanner;

public class Q6 {
    // Input currency in rupees and output in USD.
    // 1 USD = 83.71720 INR.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rupees = sc.nextFloat();
        float usd = (1/83.71720f)*rupees;

        System.out.println("In rupees : "+rupees);
        System.out.println("In USD : "+usd);

        sc.close();
    }
}