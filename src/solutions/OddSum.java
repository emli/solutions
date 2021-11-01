package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class OddSum {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();

        if (n == 1 || n == 2) {
            out.println(1);
            return;
        }
        n -= 2;


        out.println(n * (n + 1) + 1);
    }
}
