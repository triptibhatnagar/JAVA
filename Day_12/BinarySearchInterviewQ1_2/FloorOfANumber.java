package Day_12.BinarySearchInterviewQ1_2;

public class FloorOfANumber {
    static int floor(int arr[], int item) {
        //but what if the item is greater than the greatest element in array
        if(item > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(item < arr[mid]) {
                end = mid - 1;
            }else if(item > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int item = 15;
        System.out.println("Index of floor : "+floor(arr, item));
        System.out.println("Floor number : "+arr[floor(arr, item)]);
        //TIME COMPLEXITY - O(logN)
        //Floor - greatest no. in the array smaller or equal to the item
        /*
        arr = [2,3,5,9,14,16,18]
        floor of 15 = 14
        floor of 16 = 16

        same thing as ceiling
        just return end instead of start if element not found

        why end?
        s  item  e 
        while condition violated - s = e + 1
        e  item  s

        greatest no. smaller than or equal to item -> end -> floor
        smallest no. greater than or equal to item -> start -> ceiling
        */
    }
}
