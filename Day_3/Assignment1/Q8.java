package Day_3.Assignment1;

import java.util.Scanner;

public class Q8 {
    // To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.next();
        sc.close();
        for(int i = 0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}