package Day_5;
import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        //in java there is only call by value and if we pass an object's reference , its actually going to take copy of that reference which is going to point the same object
        int nums[] = {3,1,6,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[]) {
        arr[0] = 99;
    } 
}
