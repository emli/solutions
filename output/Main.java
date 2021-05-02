import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author emli
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DTakahashiUnevolved solver = new DTakahashiUnevolved();
        solver.solve(1, in, out);
        out.close();
    }

    static class DTakahashiUnevolved {
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
}

