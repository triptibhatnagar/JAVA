package Day_7;

import java.util.Arrays;

public class Q1 {
    //Swapping values in an array
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {19,20,13,42,35};
        Q1 obj = new Q1();
        obj.swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
}
