package Day_7;

import java.util.Arrays;

public class Q2 {
    //Maximum value of an array
    int maxElem(int arr[]) {
        if(arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    int maxRange(int arr[], int start, int end) {
        if(end < start) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {19,20,13,42,35};
        Q2 obj = new Q2();
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element in this array : "+obj.maxElem(arr));
        System.out.println("Maximum element in a range of indices 0-2 : "+obj.maxRange(arr, 0, 2));
    }
}
