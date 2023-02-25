package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1 , 2, 4, 5);
        multiple(1 , 2 , 2, 3, 4, 5);
        multiple1("sanc" ,  "djraj" , 2 , 3, 4 );
    }
    static void fun(int ...v){ // array of integer
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , int ...v){
        System.out.println( a + " " +  b + " " + Arrays.toString(v));
    }

    static void multiple1(String a , String b , int ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
