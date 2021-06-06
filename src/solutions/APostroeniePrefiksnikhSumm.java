package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class APostroeniePrefiksnikhSumm {
    public void solve(long testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            a[i] += a[i - 1];
        }

        for (int i = 0; i <= n; i++) {
            out.print(a[i] + " ");
        }

    }
}
