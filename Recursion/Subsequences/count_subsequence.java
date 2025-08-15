package Recursion.Subsequences;

public class count_subsequence {
    public static int countSubsequences(int idx , int[] arr , int k , int sum ){
        if(idx == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }
        sum += arr[idx];
        int l = countSubsequences(idx + 1 , arr, k, sum );
        sum -= arr[idx];
        int m = countSubsequences(idx + 1 , arr, k, sum );

        return l + m;

    }
    public static void main(String[] args) {
        int[] arr = { 2 , 4 , 6 , 8};
        int k = 10;
        int ans = countSubsequences(0, arr, k, 0);
        System.out.println(ans);
    }
    
}
