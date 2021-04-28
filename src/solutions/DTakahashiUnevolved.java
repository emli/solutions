package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class DTakahashiUnevolved {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextLong();
        long y = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();

        int ans = 0;

        while (x < y){

            if (x * a < x + b){
                x *= a;
            }else {
                x += b;
            }
            ans++;
        }

        out.println(ans - 1);

    }
}
