package Day_6;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimArr {
    public static void main(String[] args) {
        //MultiDimArr - an array of arrays
        Scanner sc = new Scanner(System.in);

        //Syntax of 2d array
        // int arr[][] = new int[3][];
        
        //specifying row no. is mandatory but specifying col no. is not mandatory

        //or, directly
        // int nums[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        //Internal working of 2d array
        /*
        In c or cpp, it is continuous memory allocation.
        0th index of 2d array -> a 1d array
        1st index of 2d array -> a 1d array
        2nd index of 2d array -> a 1d array
        => an array of arrays

        individual arrays like [1,2,3] and [4,5,6] and [7,8,9] these are going to reference to the 2d array

        arr[1] = [4,5,6]
        arr[1][0] = 4

        size of the individual rows do not matter i.e. size of columns can vary
        */
        int arr2D[][] = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        System.out.println(arr2D.length);//no of rows
        //2D array input
        /*
        for(int i=0; i<arr2D.length; i++) {
            for(int j=0; j<arr2D[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        */
        //2D array output
        for(int i=0; i<arr2D.length; i++) {
            for(int j=0; j<arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        //or
        for(int i=0; i<arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }
        //or
        //in arr2D , what is the type of every element, it is integer array.
        for (int[] a : arr2D) {
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
