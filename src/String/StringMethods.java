package String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sanchit Ingale";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // will not change the org one
        System.out.println(name);

        System.out.println("  Sanchit           ".strip());
    }
}
