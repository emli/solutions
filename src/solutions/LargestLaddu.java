package solutions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class LargestLaddu {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int size = (int) Math.pow(2, n);
        long[] a = new long[size];

        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }


        long max = Arrays.stream(a).max().orElse(0);
        long min = Arrays.stream(a).min().orElse(0);

        if (max - min <= 1) {
            out.println("YES");
        } else {
            out.println("NO");
        }


    }
}
