public class fibbo {
    public static int getNthFibboNum(int n ){
        if(n == 2 || n == 1){
            return 1;
        }
        return getNthFibboNum(n - 1) + getNthFibboNum( n - 2 );
    } 
    public static void main(String[] args) {
        int n = 5;
        int ans = getNthFibboNum(n);
        System.out.println( ans );
    }
}
