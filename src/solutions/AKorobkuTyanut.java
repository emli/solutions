package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class AKorobkuTyanut {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if (x1 == x2 || y1 == y2) {
            out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
        } else {
            out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) + 2);
        }
    }
}
