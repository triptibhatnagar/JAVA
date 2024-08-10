package Day_8;

public class LinearSearch {
    //search in the array :  return the idx if item found =, else return -1
    static int linear_search_returnIdx(int arr[], int item) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;//-1 will never be an idx
    }

    static int linear_search_returnVal(int arr[], int item) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i : arr) {
            if(i == item) {
                return item;
            }
        }
        return Integer.MAX_VALUE;
        // return -1; //we can't write this as we will not know that is it the value or value not found
    }

    static boolean linear_search_returnTF(int arr[], int item) {
        if(arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,8,6,39};
        
        /*
        Time complexity -
        Best case : O(1) [not depend on arr length] -> constant time complexity
        Worst case : O(n) [depend on arr length] -> size of input is growing => time complexity also growing linearly
        Space complexity - constant here
        */
        int ans1 = linear_search_returnIdx(arr, 39);
        int ans2 = linear_search_returnIdx(arr, 0);
        System.out.println(ans1);
        System.out.println(ans2);

        System.out.println(linear_search_returnVal(arr, 39));

        System.out.println(linear_search_returnTF(arr, 39));
        System.out.println(linear_search_returnTF(arr, 0));

    }
}
