package Functions;

public class ParameterPassing {
    public static void main(String[] args) {
        sum(5 , 6);
        String personalMsg = greet("Sanchit");
        System.out.println(personalMsg);
    }

    static void sum(int a , int b){
        System.out.println("The Sum is " + (a+b));
    }

    //personalised message
    static String greet(String name){
        String message = "hello this is " + name ;
        return message;
    }

}
