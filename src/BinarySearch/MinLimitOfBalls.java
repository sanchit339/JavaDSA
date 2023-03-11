package BinarySearch;

import java.util.Arrays;

public class MinLimitOfBalls {
    public static void main(String[] args) {

    }

    // keep mid as penalty
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1 , end = Arrays.stream(nums).max().getAsInt();
        int ans = end; // initially ans is max then we reduce it to reduce the penalty
        while (start < end){
            int penalty = start + (end - start) / 2;
            int ops = 0; // initial operation is zero
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > penalty){
                    if(nums[i] % penalty == 0){
                        ops += nums[i] / penalty - 1; // 9 / 3 = 3 but 2 ops
                    }
                    else {
                        ops += nums[i] / penalty;
                    }
                }
            }
            if(ops <= maxOperations){
                ans = penalty; // let ans be present penalty
                //let's reduce the penalty
                end = penalty;
            }
            else {
                // if till you cant get ans then
                start = penalty + 1;
            }
        }
        return ans;
    }
}
