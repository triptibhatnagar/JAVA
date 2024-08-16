package Day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //WHY WE NEED AN ARRAYLIST?
        /*
        arrays are of fixed size, but if you don't know the array size and want java to handle the size, then we use arraylist
        it is similar to vectors in cpp
        Arraylist is a part of java collection framework(java provides the implementation of different data structures in collection framework)
        arraylist is basically a dynamic array
        */

        //SYNTAX OF ARRAYLIST
        //class<WrapperClass> refVar              //constructor
        ArrayList<Integer> list = new ArrayList<>(10);//10 -> default size

        /*
        //Add an item
        list.add(10);
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(67);
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(100);
        list.add(200);
        list.add(27);

        //check whether list contains an element
        System.out.println(list.contains(779));

        //update element
        list.set(0, 99);
        System.out.println(list);//it internally calls the toString()

        //delete element
        list.remove(4);
        System.out.println(list);

        */
        //taking input
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println(list);
        //or

        //Get an item
        for (int i = 0; i < 10; i++) {
            list.get(i);
        }


        //Internal working of arraylist
        /*
        same as array but
        ArrayLists can only store objects
        */

        //in arraylist, how size is not required ?
        //But we specified 10, how it is adding more than 10 items
        /* 
         * Actually, Size is fixed internally
         * Assume : arraylist fills by some amount, it will create a new arraylist of say double the size, old elements are copied in new arraylist, old one is deleted , hence amortized time complexity of an ArrayList is O(1) on average
        */
        
        sc.close();
    }
}
