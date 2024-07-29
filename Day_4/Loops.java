package Day_4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //loops - tasks you want to do repeatedly

        //for loop
        // for(initialization; condition; increment/decrement) {
        //  body
        // }

        //Print from 1 to 5
        for(int i=1; i<=5; i+=1) {
            System.out.println(i);
        }
        //Print even no. from 0 to 10
        for(int i=0; i<=10; i+=2) {
            System.out.println(i);
        }
        //Print from 1 to n
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++) {
            System.out.print(i+" ");
        }
        //Print "Hello world" n times
        for(int i=1; i<=n ; i++) {
            System.out.print("Hello World ");
        }  

        //while loop

        //initialization
        //while(condition) {
        //  body
        //  inc/dec
        // }

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num+=1;
        }
        //while loop - used when u dont know how many times a loop is going to run
        //for loop - used when u know how many times a loop is going to run

        //eg -1) print n numbers(for loop), 2) take input from user until user press 'x'(while loop)


        //do-while loop
        // do{
        //     body
        // }while(condition);

        do{
            System.out.println(num);
            num++;
        }while(num <= 5);

        //do while loop execute atleast once

        int x = 1;
        do{
            System.out.println("Hey");
        }while(x != 1);
    }  
}