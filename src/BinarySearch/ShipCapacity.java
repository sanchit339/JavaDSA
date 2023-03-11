package BinarySearch;

public class ShipCapacity {
    public static void main(String[] args) {

    }

    public int shipWithinDays(int[] weights, int days) {
        int start = 0 , end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start,weights[i]);
            end += weights[i];
        }

        while (start < end){
            int mid = start + (end - start) / 2;
            int sum = 0 , day = 1; // initially one day
            for(int weight:weights){
                if(sum + weight > mid){
                    sum = weight ; //  start new day
                    day++;
                }
                else {
                    sum += weight;
                }
            }

            if(day > days){
                start = mid + 1; // here mid no ans
            }
            else {
                end = mid;
            }
        }
        return start; // at last every one same return any
    }
}
