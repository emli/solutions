package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;

public class AVibori {
    public static int max(Integer... values) {
        return Collections.max(Arrays.asList(values));
    }
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int []a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();

        if (a[0] == a[1] && a[1] == a[2]){
            out.println((1) + " " + (1) + " " + (1));
            return;
        }

        int []ans = new int[3];
        for (int i = 0; i < 3; i++) {
            int best = -1;
            for (int j = 0; j < 3; j++) {
                if (i != j){
                    best = Math.max(best,a[j]);
                }
            }
            if (best < a[i]){
                ans[i] = 0;
            }else if (best == a[i]){
                ans[i] = 1;
            }else {
                ans[i] = (best + 1) - a[i];
            }
        }

        out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}
