/**
 * TC O(n) - N times 
 * SC O(n) - N names in the Stack
 */

public class print_n_names{
    // Function to print names recursively
    public static void printNames(int n , int x , String name){
        if(n > x){
            return ;
        }
        System.out.println(name);
        printNames(n + 1, x, name);
    }
    public static void main(String[] args) {
        printNames(0, 5, "Sanchit");
    }
}