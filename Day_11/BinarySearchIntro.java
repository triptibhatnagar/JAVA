package Day_11;

public class BinarySearchIntro {
    public static void main(String[] args) {
        //Binary Search Basic Idea
        /*
        it is optimized way of searching
        Linear Search Worst case - O(n) 
        binary search - used for sorted arrays
        arr1 = [2, 4, 9, 10, 12, 14, 18, 19] sorted in ascending order
        arr2 = [19, 12, 6, 5, 3, 2, -8, -16] sorted in descending order
        Linear seach traverse the entire array, max comparisons = n => no. of elements

        Example - 
        arr = [2, 3, 6, 9, 11, 12, 14, 20, 36, 48]
        item = 36
        Binary search algorithm :-
        1) Find the mid elem
        2)  if item > mid elem, then
                search in right 
            else
                search in left
        3) if mid elem == item, then 
                ans = mid elem

        if start > end : element not found
        */


        //Why we do binary search
        /*
        Best case - O(1) //size does not matter here
        
        Find the max no. of comparisons in worst case in binary search.
        [                |                  ] n    -> n/ 2^0   //0th level
        [       |        ]                    n/2  -> n/ 2^1   //1st level
        [   |   ]                             n/4  -> n/ 2^2   //2nd level
        [ | ]                                 n/8  -> n/ 2^3   //3rd level
        :
        :
        :
        []                                    1    -> n/ 2^k   //kth level
        for kth level  -> n/ 2^k
        
        Value of k: 
        log(N) = log(2^k)
        log(N) = k log(2)
        k = log(N)/log(2) = log(base2)N
        k : total no. of comaprisons in the worst case

        So, total comparisons in worst case = logN (ignoring constants)


        N = 10
        1. arr = [2, 3, 6, 9, 11, 12, 14, 20, 36, 48]    mid = (0+9)/2 = 4    N = 10/2^0 = 10
        2. arr = [2, 3, 6, 9, 11]                        mid = (0+4)/2 = 2    N = 10/2^1 = 5
        3. arr = [2, 3, 6]                               mid = (0+2)/2 = 1    N = 10/2^2 = 2
        4. arr = [2,3]                                   mid = (0+1)/2 = 0    N = 10/2^3 = 1
        5. mid elem = 2
        item = 2
        k = 3 (k = log2(10) = 3.321 => int k = 3)
        => 3 comparisons are done 
        */

        /*
        For 1 million elements in an array :-
        Linear Search = O(1000000)  [N = 1000000]  (O(N))
        Binary Search = O(20)  [log2(N) = 19.931]  (O(logN))
        */     

        int arr[] = {18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int ans = binarySearch(arr, 22);
        System.out.println(ans);
    }

    static int binarySearch(int arr[], int item) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            //int mid = (start+end)/2; //but if start and end have very large values, so it will exceed int range due to (start+end)
            //better way to find mid
            int mid = start + (end - start) / 2;
            if(item < arr[mid]) {
                //LHS -> start remains unchanged
                end = mid - 1;
            }else if(item > arr[mid]) {
                //RHS -> end remains unchanged
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;//not found
    }
}
