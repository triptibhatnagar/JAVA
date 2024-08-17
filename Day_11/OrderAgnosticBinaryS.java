package Day_11;

public class OrderAgnosticBinaryS {
    static int orderAgnosticBS(int arr[], int item) {
        int start = 0;
        int end = arr.length - 1;
        
        //find whether array is in ascending or descending order
        // boolean isAsc;
        // if(arr[start] < arr[end]) {
        //     isAsc = true;
        // } else {
        //     isAsc = false;
        // }
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == item) {
                return mid;
            }
            if(isAsc) {
                if(item < arr[mid]) {
                    //LHS -> start remains unchanged
                    end = mid - 1;
                }else {
                    //RHS -> end remains unchanged
                    start = mid + 1;
                }
            }else {
                if(item > arr[mid]) {
                    //LHS -> start remains unchanged
                    end = mid - 1;
                }else {
                    //RHS -> end remains unchanged
                    start = mid + 1;
                }
            }
        }
        return -1;//not found
    }
    public static void main(String[] args) {
        //array is sorted, but in which order - ascending or descending ?
        /*
        array is sorted i.e.
        for ascending order - every single element will be greater or equal to the previous element
        for descending order - every single element will be smaller or equal to the previous element

        so we can take any two elements and compare but what if
        arr = [3,3,3,4,5,6]

        so, the best way is to compare the start and end element

        if(startElem < endElem) -> decreasing order
        else -> increasing order
        */
        int arr[] = {2, 3, 6, 9, 11, 12, 14, 20, 36, 48};
        int arr2[] = {90, 75, 18, 12, 6, 4, 3, 2};
        int item = 20;

        int ans = orderAgnosticBS(arr, item);
        System.out.println(ans);

        int ans2 = orderAgnosticBS(arr2, item);
        System.out.println(ans2);
    }
}