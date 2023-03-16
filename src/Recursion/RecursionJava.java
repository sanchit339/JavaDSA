package Recursion;

public class RecursionJava {
    public static void main(String[] args) {
        print(1);
    }

    // recursive function
    static void print(int n){
        // base condition
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
