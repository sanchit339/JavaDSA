public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * (fact(n - 1));
    }

    public static void nonFunctional(int n , int fact){
        if(n == 0){
            System.out.println(fact);
            return;
        }
        nonFunctional(n - 1, n * fact);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.print("with Functional : ");
        nonFunctional(5, 1);
    }    
}
