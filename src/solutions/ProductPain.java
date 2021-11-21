package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ProductPain {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }


        long sum = 0;

        for (int i = 0; i < n; i++) {
            for (int k = i + 2; k < n; k++) {
                int j = (i + k) / 2;

                long best = 0;
                for (int l = -1; l <= 1; l++) {
                    if (l + j > 0 && l + j < n) {
                        best = Math.max(best, (a[i] - a[j + l]) * (a[j + l] - a[k]));
                    }
                }
                sum += best;
            }
        }

        out.println(sum);
    }
}
