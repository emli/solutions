package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ChefAndWaterCar {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long v = in.nextLong();

        long max = n * (n - 1) / 2;

        long min = Math.min(n - 1, v);

        n = (n - 1) - min;

        min += (n + 2) * (n + 1) / 2 - 1;

        out.println(max + " " + min);
    }
}

