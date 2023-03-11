package BinarySearch;

public class MedianOfTwoArray {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // take a min size array for the binary search
        if(nums2.length < nums1.length){
            return findMedianSortedArrays(nums2 , nums1);
        }

        int n1 = nums1.length , n2 = nums2.length;
        // for min smaller array
        int start = 0 , end = n1;

        while (start <= end){
            int cut1 = (end + start) >> 1;  // same as num/2
            int cut2 = (n1 + n2 + 1) / 2 - cut1 ; // handle both for odd , even number

            int left1 = cut1 == 0 ? Integer.MIN_VALUE :  nums1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE :  nums2[cut2 - 1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            if(left1 <= right2 && left2 <= right1){
                if( (n1 + n2) % 2 == 0 )
                    return (Math.max(left1 , left2) + Math.min(right1 , right2)) / 2.0; // for even length find the avg
                else
                    return Math.max(left1 , left2); // odd len so max in middle just find the max one as they are merged
            } else if (left1 > right2) {  // always manipulate min size array
                end = cut1 - 1;
            }
            else {
                start = cut1 + 1;
            }
        }
        return 0.0; // not got
    }
}
