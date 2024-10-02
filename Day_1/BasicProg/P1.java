package Day_1.BasicProg;

import java.util.Scanner;

public class P1 {
    //Take a name as input and output Hello name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        sc.close();
    }
}
