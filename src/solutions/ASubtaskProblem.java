package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class ASubtaskProblem {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (Arrays.stream(a).allMatch(e -> e == 1)){
            out.println(100);
        }else if (Arrays.stream(Arrays.copyOfRange(a, 0, m)).allMatch(e -> e == 1)){
            out.println(k);
        }else {
            out.println(0);
        }
    }
}
