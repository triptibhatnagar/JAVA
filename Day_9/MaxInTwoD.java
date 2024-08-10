package Day_9;

public class MaxInTwoD {
    static int max(int arr[][]) {
        // int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         if(max < arr[i][j]) {
        //             max = arr[i][j];
        //         }
        //     } 
        // }
        for (int[] is : arr) {
            for (int is2 : is) {
                if(max < is2) {
                    max = is2;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {45, 9, 21},
            {0, 4, 28, 91},
            {76, 43, 8, 40},
            {18, -3}
        };
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);//-2147483648
    }
}
