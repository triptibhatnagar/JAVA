package Day_5;

public class Arrays {
    public static void main(String[] args) {
        //Why we need arrays?
        /*
        Q: store a roll no.
        int a = 27;
        Q: store a person's name
        String name = "ABC"
        Q: store 5 roll no.
        int rn1 = 1;
        int rn2 = 2;
        int rn3 = 3;
        int rn4 = 4;
        int rn5 = 5;
        */

        //What is an array?
        /*
        there must be a data structure where i could store collection of same datatypes
        Arrays : collection of datatypes (primitive or objects or complex datatype)
        */

        
        //Syntax of an array
        /*
        datatype[] arr_name = new datatype[size];

        Q: store 5 roll numbers
        int[] rn = new int [5];     or      int[] rn = {1,2,3,4,5};

        * datatype is representing which type of data is stored
        * all the type of data in array must be same
        * rn is pointing to an array object that contains integer type elements
        * int : datatype
        * rn : reference variable
        */


        //How does array works?
        /*
        this reference variable is pointing to the array object
        RHS : object
        LHS : reference variable

        int[] rn; //declaration of array, rn is getting defined in the stack
        rn = new int[5]; //initialization, actually here object is being created in the heap memory
        */


        //Internal working of an array
        /*
        LHS : compile time
        RHS : run time
        At the runtime, memory is allocated -> dynamic memory allocation
        */


        //Dynamic memory allocation - assigning memory space during the execution or runtime
        /*
        Stack - in which all functions and reference variables go
        Heap - in which objects go
        so, here reference variable is pointing towards the array object(stack pointing towards heap)
        */


        //Internal Representation of array
        /*
        [3,8,19,12,7,28,33]
        */


        //Continuity of array
        /*
        array in c or c++, is like a continuous memory allocation (alternate memory address)
        but in java, it totally depends on JVM whether it has continuous memory allocation or not

        * array objects are in heap
        * but no pointers in java and in JLS(java language specification), they have mentioned that heap objects are not continuous
        * heap is the runtime data area from which the memory for all the classes and instances of all the arrays is allocated(dynamic memory allocation)
        => Hence, array objects in java internally may not be continuous.
        */


        //Index of array
        /*
        int arr[] = {3,12,67,23,90};
        they represent the position of array elements
        start from 0
        System.out.println(arr[0]); -> which element is present at 0th index
        arr[4] = 99; //changing the value
        */

        
        //new keyword
        /*
        basically, used to create an object(dynamic memory allaocation at run time)
        */
        

        int[] rn = new int [5];
        System.out.println(rn[3]); //0
        //for an integer array, by default, all elements are 0.


        //String array 
        String str[] = new String[4];
        System.out.println(str[3]);//null


        //What is null in java?
        /*
        null is a special literal of null type
        any reference variable that you take, by default it is having null type
        you can cast null to any particular reference type but you can't create a null type
        null a = null; (can't do this)
        you can't reference null to primitives.
        you can only assign null to non-primitives.
        String s = null; //(can be done)
        */


        //null is used as a default
        /*
        String[] strs = new String[5];
        //internal working of object array
        primitives and reference variables are stored in stack memory only but all the other objects like string type, array type or your own type, hash map, classes are stored in heap memory
        here, strs in stack and [_,_,_,_,_] in heap, each particular element of string array is an object itself in separate areas in heap memory
        * reference variables will point to the heap memory
        * if each particular element of the array is an object then it will be located in some other area of heap memory and the reference variable(Eg - strs[0], strs[4]) is pointing to the array elements
        * array is just a collection of reference variables
        * by default, for every reference variable, if there is no value, then it is null.
        */
    }
}