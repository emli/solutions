package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class CNeSosednyayaMatritsa {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        if (n == 2){
            out.println(-1);
            return;
        }
        int[][] a = new int[n][n];

        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]!= 0){
                    continue;
                }
                a[i][j] = ++pos;

                if (pos >= n * n){
                    continue;
                }
                int x = i;
                int y = j;
                for (int k = 0; k < 3; k++) {
                    if (pos > n * n){
                        continue;
                    }

                    int tmp = n - x - 1;
                    a[y][n - x - 1] = ++pos;
                    x = y;
                    y = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }

    }
}
