package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class BDelisNa25 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        String s = in.nextLine();

        if (s.length() == 0){
            s = in.nextLine();
        }
        String[] a = {"00","25","75","50"};

        int ans = Integer.MAX_VALUE;

        for (String value : a) {
            for (int right = s.length() - 1; right >= 0; right--) {
                for (int left = right - 1; left >= 0; left--) {
                    if (s.charAt(left) == value.charAt(0) && s.charAt(right) == value.charAt(1)) {
                        ans = Math.min(ans, ((s.length() - right - 1) + (right - left - 1)));
                    }
                }
            }
        }
        out.println(ans);
    }
}
