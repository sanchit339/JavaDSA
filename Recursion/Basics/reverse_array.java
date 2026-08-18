
public class reverse_array {
    public static int[] reverseArray(int[] arr , int i , int j){
        if(i > j){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reverseArray(arr, i + 1, j - 1);
    }
    public static void main(String[] args) {
        int[] array = {1 , 2, 3, 4 , 5 , 6 , 7, 8 , 9};  
        int[] ans = reverseArray(array , 0 , array.length - 1);
        for (int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
