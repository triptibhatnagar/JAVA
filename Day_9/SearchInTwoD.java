package Day_9;

import java.util.Arrays;

public class SearchInTwoD {
    static int[] search(int arr[][], int target) {
        if(arr.length == 0) {//arr is empty
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
            
        }
        return new int[]{-1, -1};    
    }
    public static void main(String[] args) {
        int arr[][] = {
            {45, 9, 21},
            {0, 4, 28, 91},
            {76, 43, 8, 40},
            {18, -3}
        };
        int target = 18;
        int ans[] = search(arr, target); // format of return value [row, col]
        System.out.println(Arrays.toString(ans));
    }
}
