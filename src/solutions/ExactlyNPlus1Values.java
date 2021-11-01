package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ExactlyNPlus1Values {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextInt();

        long power = (long) Math.pow(2, n);

        long times = power / 2 - 1;

        long c = 1;

        out.print("1 1 ");

        while (times > 0) {
            out.print((2 * c) + " ");
            times -= c;
            c += c;
        }
        out.println();
    }
}
