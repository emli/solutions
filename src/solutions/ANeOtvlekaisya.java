package solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ANeOtvlekaisya {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            if (solve(in)){
                out.println("YES");
            }else {
                out.println("NO");
            }
        }
    }

    private boolean solve(Scanner in) {

        int n = in.nextInt();in.nextLine();
        String s = in.nextLine();

        System.out.println(n);
        System.out.println(s);

        System.out.flush();

        for (int i = 0; i < s.length() - 1; i++) {
            int signal = 1;
            for (int j = i + 1; j < s.length(); j++) {
                boolean equality = s.charAt(i) == s.charAt(j);
                if (equality && signal == -1){
                    return false;
                } else if (!equality){
                    signal = -1;
                }
            }
        }
        return true;
    }
}
