package Day_9;

import java.util.Arrays;

public class SearchInRange {
    static int search(int arr[], int start, int end, int item) {
        if(arr.length == 0) {//arr is empty
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12, 23, 8, 87, 45, 7, 87, 32, 54, 1, 57, 49};
        int item = 1;
        int start = 3;
        int end = 8;

        System.out.println(search(arr, start, end, item));
        System.out.println(Arrays.toString(arr));

        //in array -> length is a variable => arr.length
        //in string -> length is a function => str.length()
    }
}
