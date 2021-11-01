package solutions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MedianRearrangement {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long k = in.nextLong();

        long[] a = new long[n * n];

        for (int i = 0; i < n * n; i++) {
            a[i] = in.nextLong();
        }

        Arrays.sort(a);

        Long min = Long.MAX_VALUE;
        for (int i = n * n - n - 1; i >= n * n - 2 * n; i--) {
            min = Math.min(min, a[i]);
        }

        out.println(min);
    }
}
