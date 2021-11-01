package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class QueensPlacement {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Character[][] matrix = new Character[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }
        int k = n - 2;

        int pos = n - 1;
        for (int i = 0; i < k - 1; i++) {
            matrix[i][pos] = 'Q';
            pos--;
        }

        matrix[n - 2][1] = 'Q';


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(matrix[i][j]);
            }
            out.println();
        }
    }
}
