package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class AverageFlex {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;
            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    continue;
//                }
                if (a[i] >= a[j]) {
                    x++;
                } else {
                    y++;
                }
            }
            if (x > y) {
                ans++;
            }
        }
        out.println(ans);
    }
}
