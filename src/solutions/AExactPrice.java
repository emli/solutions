package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class AExactPrice {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        if (n > 0 && n % 100 == 0) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }
}
