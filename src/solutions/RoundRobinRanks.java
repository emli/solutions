package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class RoundRobinRanks {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        out.println(2 * (n - k) + k - 1 - (k - 1) % 2);
    }
}
