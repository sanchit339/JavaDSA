package String;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // return integer --> 195
        System.out.println("a" + "b"); // return   ab
        System.out.println((char)('a' + 3)); // return char --> d [ a + 3 ]
        System.out.println("a" + 1); // return a1 --->  to string method

        System.out.println("Sanchit" + new ArrayList<>()); // as it is empty --> Sanchit[]
    }
}
