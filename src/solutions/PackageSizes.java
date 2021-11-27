package solutions;

import java.util.Arrays;

import static java.lang.Math.min;

public class PackageSizes {
    int go(int[] sizes, int total,int pos,int dp[][]){
        if (dp[total][pos] != -1){
            return dp[total][pos];
        }
        if (pos == sizes.length){
            if (total == 0) {
                return 0;
            }
            return Integer.MAX_VALUE / 2;
        }

        int ans = Integer.MAX_VALUE / 2;

        for (int size : sizes) {
            if (total - size >= 0)
                ans = min(ans, go(sizes, total - size, pos + 1,dp) + 1);
            ans = min(ans, go(sizes, total, pos + 1,dp));

        }
        return dp[total][pos] = ans;
    }
    public int getMinimum(int[] sizes, int total) {

        int dp[][] = new int[total + 1][sizes.length + 1];
        for (int[] row: dp)
            Arrays.fill(row, -1);

        int ans = go(sizes,total,0,dp);
        if (ans == Integer.MAX_VALUE / 2){
            return -1;
        }
        return go(sizes,total,0,dp);
    }
}
