package Day_9;

import java.util.Arrays;

public class SearchInString {
    static boolean search(String str, char item) {
        if(str.length() == 0) {//str is empty
            return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == item) {
        //         return true;
        //     }
        // }
        for(char ch : str.toCharArray()) {
            if(ch == item) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        char item = ' ';

        System.out.println(search(str, item));
        System.out.println(Arrays.toString(str.toCharArray()));

        //in array -> length is a variable => arr.length
        //in string -> length is a function => str.length()
    }
}
