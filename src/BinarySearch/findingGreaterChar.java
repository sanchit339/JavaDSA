package BinarySearch;

public class findingGreaterChar {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0 , end = letters.length;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1 ;
            }
        }
        return letters[start % letters.length]; // for finding floor just return the end
    }
}
