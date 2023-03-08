package ArrayImpl;

// count how many have even-digits in them
// from leetcode

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = {12 , 321 , 21 , 1 , 2 , 21};
        int ans = evenCheck(arr);
        System.out.println(ans);
    }
    static int evenCheck(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        if(num == 0){
            return false;
        }
        int count = 0;
        while (num>0){
            count++;
            num /= 10;
        }
        if(count%2 == 0){
            return true;
        } return false;
    }

    // alternate method
    static int digit2(int num){
        return (int)(Math.log10(num));
    }
}
