package Day_4;

public class Conditions {
    public static void main(String[] args) {
        /*
         * Syntax of if-else :-
         * if (boolean expression T or F) {
         *  //body
         * }else {
         *  //do this
         * }
         */

         //example
         int salary = 20000;
         if(salary > 10000) {
            salary += 2000;
         }else {
            salary += 1000;
         }

         System.out.println(salary);


         //multiple if-else
         int income = 12000;
         if(income > 10000) {
            income += 2000;
         }else if(income > 20000) {
            income += 3000;
         }else {
            income += 1000;
         }
         System.out.println(income);
    }
}
