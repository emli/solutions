package solutions;

import java.util.ArrayList;

public class MakeItDivisible {
    int countDiff(String a,String b){
        int ans = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)){
                ans++;
            }
        }
        return ans;
    }
    public int change(int N) {
        int maxDiff = Integer.MAX_VALUE;
        int res = 0;
        for (int number = Math.max(N - 10000,0); number <= N + 10000; number++){
            if (String.valueOf(N).length() == String.valueOf(number).length() && number % 7 == 0){
                int x = countDiff(String.valueOf(number),String.valueOf(N));
                if (x < maxDiff){
                    maxDiff = x;
                    res = number;
                }
            }
        }
        return res;
    }
}
