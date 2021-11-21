package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class TrieMinimization {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.nextLine());

        String a = in.nextLine();
        String b = in.nextLine();

        int ans = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                ans++;
            }
        }
        out.println(ans);
    }
}
