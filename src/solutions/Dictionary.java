package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class Dictionary {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();

        String left = "qwertasdfgzxcvb";

        int ok;
        if (left.indexOf(s.charAt(0)) >= 0){
            ok = 1;
        }else {
            ok = 0;
        }

        for (int i = 1; i < s.length(); i++) {
            if (left.indexOf(s.charAt(i)) >= 0) {
                if (ok == 1){
                    out.println("no");
                    return;
                }
                ok = 1;
            }else {
                if (ok == 0){
                    out.println("no");
                    return;
                }
                ok = 0;
            }
        }

        out.println("yes");
    }
}
