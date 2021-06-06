import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author emli
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DCooking solver = new DCooking();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCooking {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];

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

            out.println(Math.max(s1, s2));

        }

    }
}

