package solutions;

import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Task {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    String addTrailingZeros(int x, boolean year) {
        StringBuilder zz = new StringBuilder(String.valueOf(x));

        if (!year) {
            if (x < 10) {
                return "0" + x;
            }
            return String.valueOf(x);
        } else {
            while (zz.length() != 4) {
                zz.insert(0, "0");
            }
        }
        return zz.toString();
    }

    int getDays(int day, int month, int year) {
        return day + month * 30 + year * 365;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String str = in.nextLine();
        if (Objects.equals(str, "")) {
            str = in.nextLine();
        }

        int x = Integer.parseInt(str.substring(0, 2));
        int y = Integer.parseInt(str.substring(2, 4));
        int z = Integer.parseInt(str.substring(4, 8));

        String best = null;
        int diff = Integer.MAX_VALUE;

        int t = 0;

        for (int year = 1; year <= 9999; year++) {
            String option = new StringBuilder(String.valueOf(addTrailingZeros(year, true))).reverse() + addTrailingZeros(year, true);

            int d = getDays(x, y, z) - getDays(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)), year);

            if (Integer.parseInt(option.substring(0, 2)) <= 30 && Integer.parseInt(option.substring(0, 2)) > 0 && Integer.parseInt(option.substring(2, 4)) <= 12 && Integer.parseInt(option.substring(2, 4)) > 0 && isPalindrome(option)) {
                t++;
                best = option;
                diff = d;
            }
        }


        if (best == null) {
            out.println(-1);
        } else {
            out.println(best);
        }

    }
}

