package Functions;

import java.util.Scanner;

public class SumJava {
    public static void main(String[] args) {
        sum();
        int ans = sum1();
        System.out.println("the sum is :- " + ans);
    }

    static int sum1(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st num:- ");
        a = sc.nextInt();
        System.out.print("enter 2nd num :- ");
        b = sc.nextInt();
        return (a+b);
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number :- ");
        int a , b;
        a = sc.nextInt();
        System.out.print("enter second number :- ");
        b = sc.nextInt();
        System.out.println("sum of number is :- " + (a + b));
    }
}
