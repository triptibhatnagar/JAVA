package Day_4;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        //Find the largest of 3 numbers
        /* 
        if(n1 > n3 && n1 > n2) {
            System.out.println("n1 is max");
        }else if(n2 > n3) {
            System.out.println("n2 is max");
        }else {
            System.out.println("n3 is max");
        }
        */
        /*
        int max = n1;
        if(n2 > max) {
            max = n2;
        }
        if(n3 > max) {
            max = n3;
        }
        System.out.println(max);
         */

         /*
         int max = 0;
         if(n1 > n2) {
            max = n1;
         }else {
            max = n2;
         }
         if(n3 > max) {
            max = n3;
         }
         System.out.println(max);
          */

          int max = Math.max(n3,(Math.max(n1, n2)));
          System.out.println(max);


          //Q2 - a char is whether upper or lower
          char ch = sc.next().trim().charAt(0);
          //trim() - extra space after, before removed
          //charAt(idx) - returning char type

        //   String str = "hello";
        //   System.out.println(str.charAt(2));

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        }else {
            System.out.println("uppercase");
        }

        //Q3 - Find the nth Fibonacci number
        //a,b,temp,. -> .,a,b,temp
        int nth = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= nth) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
    }
}
