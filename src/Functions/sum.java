package Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.print("enter 1st number :- ");
        a = sc.nextInt();
        System.out.print("enter 2nd number :- ");
        b = sc.nextInt();
        System.out.println("sum of number is :- " + (a + b));
    }
}
