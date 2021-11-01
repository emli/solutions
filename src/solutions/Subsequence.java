package solutions;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subsequence {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }

        Collections.sort(even);
        Collections.reverse(even);

        Collections.sort(odd);


        long[] res = new long[n];

        int pos = 0;
        for (int i = 0; i < n; i += 2) {
            res[i] = even.get(pos);
            pos++;
        }

        pos = 0;
        for (int i = 1; i < n; i += 2) {
            res[i] = odd.get(pos);
            pos++;
        }

        for (int i = 0; i < n; i++) {
            out.print(res[i] + " ");
        }


        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    ans += res[i] * res[j];
                }
            }
        }
        out.println();

        out.println(ans);
    }
}
