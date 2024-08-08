package Day_7;

import java.util.Arrays;

public class Q3 {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length;
        while(start < end) {
            for (int i = start; i < end; i++) {
                int temp = arr[start];
                arr[start] = arr[end-1];
                arr[end-1] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        //Reversing an array
        int arr[] = {19,20,13,42,35};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
