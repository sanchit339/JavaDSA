import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2_sum {
    private static void solve(int idx , int[] nums , int temp , List<Integer> ans){
        ans.add(temp);

        for(int i = idx ; i < nums.length ; i++ ){
            if(i > idx && nums[i] == nums[i - 1]) continue;

            temp += nums[i];
            solve(i + 1, nums, temp, ans);
            temp -= nums[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 2};
        // for the unsorted array os per the question 
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();

        solve(0 , arr , 0  , ans);
        
        for(int i :  ans){
            System.out.print(i + " ");
        }
    }
}
