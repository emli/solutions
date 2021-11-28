package solutions;

import java.util.Arrays;

import static java.lang.Math.min;

public class PackageSizes {
    int go(int[] sizes, int total,int dp[]){
        if (dp[total] != -1){
            return dp[total];
        }
        if (total == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE / 2;

        boolean ok = false;
        for (int size : sizes) {
            if (total - size >= 0) {
                ans = min(ans, go(sizes, total - size, dp) + 1);
                ok = true;
            }
        }
        if (!ok) return dp[total] = Integer.MAX_VALUE / 2;
        return dp[total] = ans;
    }
    public int getMinimum(int[] sizes, int total) {

        int[] dp = new int[total + 1];
        Arrays.fill(dp, -1);

        int ans = go(sizes,total,dp);
        if (ans == Integer.MAX_VALUE / 2){
            return -1;
        }
        return ans;
    }
}
