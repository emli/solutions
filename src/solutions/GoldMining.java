package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class GoldMining {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if ((n + 1) * y >= x){
            out.println("YES");
        }else {
            out.println("NO");
        }
    }
}
