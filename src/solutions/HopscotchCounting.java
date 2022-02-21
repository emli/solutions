package solutions;

public class HopscotchCounting {
    public int count(int n) {
        int[][] dp = new int[n + 1][4];

        for (int j = 0; j <= 3; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2; j++) {
                dp[i][j] += dp[i - 1][1] % 1000000007;
                if (i  - 2 >= 0 && j != 2){
                    dp[i][j] += dp[i - 2][2] % 1000000007;
                }
            }
        }

        return dp[n][0] % 1000000007;
    }
}
