package ArrayImpl;

public class StringSearch {
    public static void main(String[] args) {
        String str[] = {"san" , "ing" , "ath" , "gho" };
        String target = "san";
        int ans = linearSearch(str , target);
        System.out.println(ans);
    }
    static int linearSearch(String[] str , String target){
        for (int i = 0; i < str.length; i++) {
            if(str[i] == target){
                return i;
            }
        }
        return -1;
    }
}
