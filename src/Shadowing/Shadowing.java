package Shadowing;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        x = 40; // x-> 40
        int x = 30; // x-> 35
    }
}
