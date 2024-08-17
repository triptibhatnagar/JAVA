package Day_11;

public class BinaryS_DescendingOrder {
    static int binarySearch(int arr[], int item) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(item > arr[mid]) {
                //LHS -> start remains unchanged
                end = mid - 1;
            }else if(item < arr[mid]) {
                //RHS -> end remains unchanged
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;//not found
    }
    public static void main(String[] args) {
        int arr[] = {90, 75, 18, 12, 6, 4, 3, 2};
        int item = 75;
        /*
        mid = start + (start-end) / 2
        if item > mid -> LHS (start remains unchanged), then
            end = mid-1
        else if item < mid -> RHS (end remains unchanged), then
            start = mid+1
         */

        System.out.println(binarySearch(arr, item));
    }
}
