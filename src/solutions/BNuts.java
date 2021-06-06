package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class BNuts {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x > 10){
                ans += x - 10;
            }
        }

        out.println(ans);
    }
}
