package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class NicePairs {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); in.nextLine();
        String s = in.nextLine();

        long ans = 0;

        for (int j = 0; j < n; j++) {
            for (int i = Math.max(0,j - 10); i < Math.min(n,j + 10); i++) {
                if (j - i > 0 && j - i == Math.abs(s.charAt(j) - s.charAt(i))){
                    ans++;
                }
            }
        }
        out.println(ans);
    }
}
