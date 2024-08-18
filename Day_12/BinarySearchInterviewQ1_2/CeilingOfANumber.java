package Day_12.BinarySearchInterviewQ1_2;

public class CeilingOfANumber {
    static int ceiling(int arr[], int item) {
        //but what if the item is smaller than the smallest element in array
        if(item < arr[0]) {
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
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int item = 15;
        System.out.println("Index of ceiling : "+ceiling(arr, item));
        System.out.println("Ceiling number : "+arr[ceiling(arr, item)]);
        //TIME COMPLEXITY - O(logN)
        //ceiling - smallest element in array that is greater than or equal to the item
        /*
        ceiling(arr, item = 14) = 14
        ceiling(arr, item = 15) = 16
        ceiling(arr, item = 4) = 5
        ceiling(arr, item = 9) = 9

        if the Q says equal to the item -> this will be exactly similar question of binary search in array
        but only change :
        if elem found - return it
        if not found - don't return -1, return the next greater element

        why binary search -> sorted arr
        series approach - array space is divided into half at each level, that space is going to be as close as it can get to the item because of the following two checks :
        if item > mid -> RHS (end remains unchanged) start = mid+1
        if item < mid -> LHS (start remains unchanged) end = mid-1

        Example:
        item = 15
        arr = [2,3,5,9,14,16,18] [s = 0(2), e = 6(18), mid = 3(9)]
        item > mid -> RHS - [14,16,18] [s = mid+1 = 4(14), e = 6(18), mid = 5(16)]
        item < mid -> mid might be a possible ans but in order to find another potential ans -> LHS - [14] [s = 4(14), e = mid-1 = 4(14), mid = 4(14)]
        item > mid -> RHS - [14,16,18] [s = mid+1 = 5(16), e = 4(14), mid = 4(14)]
        while condition violated due to (start > end)

        s  item  e -> ans is going to lie in b/w start and end but if it does not exist, so answer must lie outside it, not in between s and e.
        after while condition violated :
        e  item  s
        to find a no. greater than or equal to item -> so the ans will be start

        start <= end -> when while loop breaks -> start = end + 1
        next greater element, when no answer found -> return start

        why to return start? why not end?
        when while loop violated i.e. s  item  e does not exist, i.e., ans do not lie b/w s and e, ans must outside it, and just next greater element, and due to violation of while loop, start will be greater than end, start = end + 1 and hence return start
        */
    }
}