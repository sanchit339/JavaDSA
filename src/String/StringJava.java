package String;

public class StringJava {
    public static void main(String[] args) {
        String name = "Sanchit";
        name = "Dj Rajesh";
        System.out.println(name);
        System.out.print("Char at zero 0 index :- ");
        System.out.println(name.charAt(0));

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
