package BinarySearch;

public class SplitArray {
    public static void main(String[] args) {

    }

    // finding in between the range of the sum [ max , fullSum ]
    // max coz max time we can split is n and max will be max of array
    public int splitArray(int[] nums , int m){
        int start = 0 , end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start , nums[i]);
            end += nums[i];
        }

        // binary search
        while (start < end){
            int mid = start + (end - start) / 2; // mid is max subarray sum you can get
            // calculate how many pieces you can divide this in with (max sum )
            int sum = 0 , pieces = 1; // initially 1 is there

            for(int num:nums){
                if(sum + num > mid){
                    // you cannot add the element to the subArray , make a new array
                    // say you add this number to new SubArray , sum = sum {new sum}
                    sum = num ; // resting the sum
                    pieces++; // just like new subarray started
                }else {
                    sum += num; // keep adding
                }
            }
            if(pieces > m){
                start = mid + 1; // here mid cannot be answer so it is skipped
            }else {
                end = mid;  // because mid is one of the answer
            }
        }

        return end; // at end start = mid = end
    }
}
