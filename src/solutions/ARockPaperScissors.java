package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class ARockPaperScissors {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();

        if (x == y){
            out.println(x);
        }else {
            for (int i = 0;; i++) {
                if (i != x && i != y){
                    out.println(i);
                    break;
                }
            }
        }
    }
}
