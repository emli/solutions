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
        AKorobkuTyanut solver = new AKorobkuTyanut();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class AKorobkuTyanut {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            if (x1 == x2 || y1 == y2) {
                out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
            } else {
                out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) + 2);
            }
        }

    }
}

