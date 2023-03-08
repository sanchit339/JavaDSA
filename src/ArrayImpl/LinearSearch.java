package ArrayImpl;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4, 5, 8};
        int ans = linearSearch(arr, 8);
        System.out.println( "the element is available at index :- " +  ans);
    }

    static int linearSearch(int arr[] , int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target ){
                return i;
            }
        }
        return -1;
    }
}
