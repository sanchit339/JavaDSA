/** 
 * Question is about find all unique combination not the repetative elements
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class combination_sum_2 {
    public static void solve(int idx  , List<Integer> arr , int target , List<Integer> temp){

        if(target == 0){
            for(int i : temp) System.out.print( i + " ");
            System.out.println();
            return;
        }

        for(int i = idx ; i < arr.size() ; i++){
            if(i > idx && arr.get(i) == arr.get( i - 1 )) continue;
            
            if(arr.get(i) > target) break;
            temp.add(arr.get(i));
            // for(int it : temp) System.out.print( it + " "); // Uncommenting will give u the recursion tree
            // System.out.println();
            solve(i + 1, arr, target - arr.get(i), temp); // subsequence
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 1, 2, 7, 6, 1, 5));
        arr.sort(null);

        List<Integer> temp = new ArrayList<>();

        solve(0, arr, 8, temp);
    }
}
