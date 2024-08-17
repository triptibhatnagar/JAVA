package Day_10;

public class EvenDigits {
    static int digitsCountWay1(int num) {
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }
        int count = 0;
        while(num > 0)  {
            count++;
            num = num / 10;
        }
        return count;
    }
    //optimized way
    static int digitsCountWay2(int num) {
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
    static boolean even(int num) {
        int digits = digitsCountWay1(num);
        // if(digits % 2 == 0) {
        //     return true;
        // }
        return digits%2 == 0;
    }
    static int findNumbers(int nums[]) {
        int count = 0;
        for (int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        // for (int i = 0; i < nums.length; i++) {
        //     if(evenDigits(nums[i]) == true) {
        //         count++;
        //     }
        // }
        return count;
        }
    public static void main(String[] args) {
        // Given an array nums of integers, return how many of them contain an even number of digits.
        /*
        Example - 
        [12, 345, 2, 6, 7896]
        12 -> even no. of digits (2)
        345 -> odd no. of digits (3)
        2 -> odd no. of digits (1)
        6 -> odd no. of digits (1)
        7896 -> even no. of digits (4)
        */
        int nums[] = {12, 345, 2, -16, -7896};
        System.out.println(findNumbers(nums));
        System.out.println(digitsCountWay1(0));
        System.out.println(digitsCountWay1(-123));
        
        System.out.println(digitsCountWay2(123456));
        System.out.println(digitsCountWay2(-1234));
        System.out.println(digitsCountWay2(0));
    }
}