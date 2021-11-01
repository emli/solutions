package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ChefAndPairingSlippers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int l = in.nextInt();
        int x = in.nextInt();

        out.println(Math.min(n - l, l) * x);
    }
}
