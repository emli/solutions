package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class DanceMoves {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();

        if (x <= y) {
            if (Math.abs(x - y) == 0) {
                out.println(0);
            } else if (Math.abs(x - y) == 1) {
                out.println(2);
            } else if (Math.abs(x - y) % 2 == 0) {
                out.println(Math.abs(x - y) / 2);
            } else {
                out.println(Math.abs(x - y) / 2 + 2);
            }
        } else {
            out.println(Math.abs(x - y));
        }
    }
}
