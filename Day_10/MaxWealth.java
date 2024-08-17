package Day_10;

public class MaxWealth {
    static int maxWealth(int accounts[][]) {
        int max = Integer.MIN_VALUE;
        //for each loop
        for (int[] is : accounts) {
            int sum = 0;
            for (int is2 : is) {
                sum += is2;
            }
            if(max < sum) {
                max = sum;
            }
        }
        // for (int person = 0; person < accounts.length; person++) {
        //     int sum = 0;
        //     for (int acc = 0; acc < accounts[person].length; acc++) {
        //         sum += accounts[person][acc];
        //     }
        //     if(max < sum) {
        //         max = sum;
        //     }
        // }
        return max;
    }
    public static void main(String[] args) {
        /*
        You are given an m*n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
        */

        /*
        Example -
        int accounts[][] = {
            {1, 2, 3}, //1st person
            {3, 2}
        }
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 = 5
        1st customer is the richest with a wealth of 6, so return 6.
        */
        int accounts[][] = {
            {1, 2, 3},
            {3, 2},
            {9},
            {5, 2, 1, 4}
        };

        System.out.println("Max wealth : "+maxWealth(accounts));
    }
}
