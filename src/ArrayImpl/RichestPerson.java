package ArrayImpl;

public class RichestPerson {
    public int maximumWealth(int[][] accounts) {
        int max = 0 , sum = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;i++){
                sum += accounts[i][j];
            }
            if(sum > max) max = sum;
        }
        return max;
    }
}
