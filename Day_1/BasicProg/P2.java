package Day_1.BasicProg;

import java.util.Scanner;

public class P2 {
    //Take input of salary. If salary is greater than 10000, add bonus 2000, otherwise add bonus 1000.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary > 10000) {
            salary += 2000;
        }else {
            salary += 1000;
        }
        System.out.println("Salary after bonus : "+salary);

        sc.close();
    }
}
