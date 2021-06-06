package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class DCooking {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[]a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int s1 = 0;
        int s2 = 0;
        for (int j : a) {
            if (s1 < s2) {
                s1 += j;
            } else {
                s2 += j;
            }
        }

        out.println(Math.max(s1,s2));

    }
}
