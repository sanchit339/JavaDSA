public class permutation {
    public static void swap(int[] arr , int i , int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    public static void generate_permutation(int idx , int[] arr ){
        if(idx == arr.length){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i = idx ; i < arr.length ; i++){
            swap(arr, i, idx);
            generate_permutation(idx + 1 , arr);
            swap(arr , i , idx);

        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 3 , 2};

        generate_permutation(0, arr);
    }
    
}
