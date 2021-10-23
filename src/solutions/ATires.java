package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ATires {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();

        if (s.endsWith("er")) {
            out.println("er");
        } else {
            out.println("ist");
        }
    }
}
