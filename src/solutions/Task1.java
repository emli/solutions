package solutions;

import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.min;


public class Task1 {
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

    protected String getSaltString() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();

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

        return day + month + year;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int tests = in.nextInt();

        ArrayList<String> options = new ArrayList<>();


        for (int year = 1; year <= 9999; year++) {
            String option = new StringBuilder(String.valueOf(addTrailingZeros(year, true))).reverse() + addTrailingZeros(year, true);

            if (Integer.parseInt(option.substring(0, 2)) <= 30 &&
                    Integer.parseInt(option.substring(0, 2)) > 0 &&
                    Integer.parseInt(option.substring(2, 4)) <= 12 &&
                    Integer.parseInt(option.substring(2, 4)) > 0 && isPalindrome(option)) {
                options.add(option);
            }
        }


        Collections.sort(options);


        while (tests > 0) {
            String best = null;
            int diff = Integer.MAX_VALUE;
            tests--;
            String str = in.nextLine();
            if (Objects.equals(str, "")) {
                str = in.nextLine();
            }

            if (str.length() != 8) {
                out.println(-1);
                continue;
            }
            int x = min(Integer.parseInt(str.substring(0, 2)), 30);
            int y = min(Integer.parseInt(str.substring(2, 4)), 12);
            int z = min(Integer.parseInt(str.substring(4, 8)), 9999);


            for (String option : options) {

                int d = getDays(x, y, z) -
                        getDays(
                                Integer.parseInt(option.substring(0, 2)),
                                Integer.parseInt(option.substring(2, 4)),
                                Integer.parseInt(option.substring(4, 8)));

                if (d > 0 && d < diff && str.compareTo(option) >= 0) {
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
}
