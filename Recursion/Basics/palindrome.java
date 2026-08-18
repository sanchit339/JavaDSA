public class palindrome {
    public static boolean check_palindrome(String str , int i , int j){
        if(i > j){
            return true;
        }
        else if( str.charAt(i) != str.charAt(j) ){
            return false;
        }
        return check_palindrome(str, i + 1 , j - 1);
    }
    public static void main(String[] args) {
        String palindrome = "HEL0pLEH";
        boolean ans = check_palindrome(palindrome , 0 , palindrome.length() - 1);
        System.out.println(ans);
    }
}
