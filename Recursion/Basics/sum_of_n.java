public class sum_of_n {
    public static void printSum(int i , int n  , int total){
        if(i > n){
            System.out.println(total);
            return;
        }
        printSum(i + 1, n, total + i);
    }

    public static int printReturnSum(int n){
        if(n == 0){
            return 0;
        }
        return n + printReturnSum(n - 1);
    } 
    public static void main(String[] args) {
        printSum(0 , 10 , 0);
        System.out.println("With Return function : ");
        int total = printReturnSum(10);
        System.out.println(total);
    }
}
