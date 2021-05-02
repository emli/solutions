package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class DTakahashiUnevolved {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextLong();
        long y = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();

        long ans = 0;


        while (x <= (x + b) / a && x * a < y) {
            ans++;
            x *= a;
        }

        ans += (y - x - 1) / b;
        out.println(ans);

    }
}
