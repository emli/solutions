package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class MinMaxLCM {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextInt();
        long k = in.nextInt();

        out.println((x * 2) + " " + ((x * k) * (x * k - 1)));
    }
}
