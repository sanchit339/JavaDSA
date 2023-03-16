package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sanchit";
        String b = "Sanchit";

        // == checks if the reference variable is pointing to the same variable

//        System.out.println(a == b);

        String name1 = new String("Sanchit");
        String name2 = new String("Sanchit");

        System.out.println("Normal comparison :- " + (name1 == name2));
        System.out.println(".Equals comparison :- " + name1.equals(name2));
    }
}
