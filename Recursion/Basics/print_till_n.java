public class print_till_n {
    public static void printNums(int i , int n){
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        printNums(i + 1, n);
    }
    public static void reversePrint(int i , int n){
        if(i > n){
            return;
        }
        reversePrint(i + 1, n);
        System.out.print(i + " ");
    }
    public static void main(String[] args){
        printNums(1, 10);
        System.out.println();
        reversePrint(1, 10);
    }
}
