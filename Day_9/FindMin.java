package Day_9;

public class FindMin {
    static int findMinimum(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {12, 23, -27, 87, 45, 7, 87, 32, 54, 1, 57, 49};
        System.out.println(findMinimum(arr));
    }
}
