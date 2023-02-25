package Functions;

public class Scope {
    public static void main(String[] args) {
        int a , b;
        a = 10 ;
        b = 20;

        // the nums cannot be accessed from here

        {
            // this is block scope you can initialize new ( Values only )
            int c = 34;
            // NOT int a = 20;
            a = 45;
        }
        int c = 32;
    }

    static void random(int marks){
        int num = 75;
        System.out.println(num);
    }
}
