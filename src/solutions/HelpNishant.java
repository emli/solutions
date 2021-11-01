package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class HelpNishant {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long k = in.nextLong();
//        long ans = bruteForce(k);

        long left = 1;
        long right = k;

        while (left < right) {
            long m = (left + right) / 2;

            if (m * (m + 1) / 2 < k) {
                left = m + 1;
            } else {
                right = m;
            }
        }

//        assert ans == left * 2;

        out.println(left * 2);
    }

    private long bruteForce(long t) {
        long best = Long.MIN_VALUE;

        long b = t;
        long c = t - 1;
        long a;

        int ans = 2;

        while (true) {
            best = Math.max(best, ans);
            a = b;
            b = c;
            c = b * 2 - a - 1;

            if (b * 2 <= a + c || (a < 1 || b < 1 || c < 1)) {
                break;
            }
            ans++;
        }
        return (best * 2);
    }
}
