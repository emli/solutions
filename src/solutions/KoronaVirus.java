package solutions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class KoronaVirus {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();

        int[] b = new int[m];


        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        int d = in.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);


        int ans = 0;

        int j = 0;
        for (int i = 0; i < m; i++) {
            while (j < n && Math.abs(b[i] - a[j]) > d) {
                j++;
            }

            if (j < n && Math.abs(a[j] - b[i]) <= d) {
                ans++;
                j++;
            }
        }

        out.println(ans);

    }
}
