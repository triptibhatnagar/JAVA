package Day_1;  

public class Intro {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
        /*
         * every file with ext .java is a class itself
         * class : named prop and functions
         * Intro.java -> class name is Intro
         * capital letter -> class (by convention), it can also run by small letter but following convention is better
         * name of file : Intro.java => Intro must be a public class
         * public : access modifier i.e. the public class can be accesssed from anywhere(other files, classes, packages)
         * .class file contains bytecode
         * from where your program will start -> main function
         * function : collection of code that you can use anywhere in program
         * .java to .class via java compiler (javac) -> javac Intro.java
         * run class file -> java Intro
         */

         /*
          * public : class can be accessed from anywhere
          * class : named group of properties and functions (Eg - main function/method)
          * Intro : name of class as well as .java file name
          * main : reserved, the function has to be main only, code will not run without main
          * static : if we want to execute this main function without creating an object of Intro class(as main function is the entry point of program, so how code can run before this) and static variables and functions do not depend upon objects, hence main function is static
          * void : return type of function
          * String args[] : arguments or commandline arguments; basically an array of strings 
          * package : folder in which your java file lies
          * System : class for output
          * out (reference variable): type of printstream
          * println() : method
          */
    }
}