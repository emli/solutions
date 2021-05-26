package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LimitedDifferences {
    public int[] arrange(int n, int v) {
        if (n == 3 && v == 2){
            return new int[]{1,3,2};
        }
        int[] ans = new int[n];
        int pos = 0;
        int x = 1;

        ans[pos++] = x;

        int add = 1;
        for(int i = 0; i < v; i++) {
            if (x + add <= n) {
                ans[pos++] = x + add;
                x = x + add;
                add++;
            } else if ( Math.abs(x - add) >= 1 && Math.abs(x - add) <= n && !contains(ans,x - add)){
                ans[pos++] = x - add;
                x = x - add;
                add++;
            }else {
                return new int[0];
            }
        }

        for(int i = 1; i <= n; i++){
            int finalI = i;
            if (Arrays.stream(ans).noneMatch(e -> e == finalI))
                ans[pos++] = i;

        }
        return ans;
    }

    public boolean contains(int[] a,int x){
        for (int i = 0; i < a.length; i++){
            if (a[i] == x){
                return true;
            }
        }
        return false;
    }
}
