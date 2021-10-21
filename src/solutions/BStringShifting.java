package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class BStringShifting {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();

        String x = s;
        String y = s;

        for (int i = 0; i < s.length(); i++) {
            Character firstLetter = s.charAt(0);
            s = s.replaceFirst(String.valueOf(firstLetter), "") + firstLetter;

            if (s.compareTo(x) > 0) {
                x = s;
            }

            if (s.compareTo(y) < 0) {
                y = s;
            }
        }

        out.println(y);
        out.println(x);
    }
}
