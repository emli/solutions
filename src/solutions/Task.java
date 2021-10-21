package solutions;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String str = in.nextLine();
        if (Objects.equals(str, "")) {
            str = in.nextLine();
        }
        LocalDate date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        date = LocalDate.parse(str, formatter);


        while (true) {
            if (!(date.getYear() > 0)) break;
            date = date.minusDays(1);
            String formattedString = date.format(formatter);
            if (isPalindrome(formattedString)) {
                out.println(formattedString);
                return;
            }
        }
        out.println(-1);
    }
}
