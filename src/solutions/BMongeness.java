package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class BMongeness {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = i1 + 1; i2 < n; i2++) {
                for (int j1 = 0; j1 < m; j1++) {
                    for (int j2 = j1; j2 < m; j2++) {
                        if (a[i1][j1] + a[i2][j2] > a[i2][j1] + a[i1][j2]) {
                            out.println("No");
                            return;
                        }
                    }
                }
            }
        }
        out.println("Yes");

    }
}
