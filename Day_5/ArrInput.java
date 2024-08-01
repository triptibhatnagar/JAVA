package Day_5;

import java.util.Scanner;
import java.util.Arrays;
// import java.lang.String;

public class ArrInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ARRAY OF PRIMITIVES
        int arr[] = new int[5];
        /*
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 45;
        arr[4] = 56;
        */
        //[12, 23, 34, 45, 56]

        //System.out.println(arr[3]); //45

        //input using for loop
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //print arr[i]
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //for each loop
        /*
        for(datatype refVar : array) {
            System.out.print(num+" ");
        }
        //Here num represents elements of array
        */
        for(int i : arr) {// for every element in the array, print the element
            System.out.print(i+" ");
        }

        // System.out.println(arr[5]);// Error : ArrayIndexOutOfBoundsException


        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


        //ARRAY OF OBJECTS
        String str[] = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "hello";//str[1] is the refernce variable
        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
