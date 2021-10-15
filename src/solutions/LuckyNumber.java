package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class LuckyNumber {
    boolean isLucky(int n){
        if (n < 10){
            return n == 7;
        }
        return isLucky(n) || (n % 10 == 7);
    }
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (isLucky(a) || isLucky(b) || isLucky(c)){
            out.println("YES");
        }else {
            out.println("NO");
        }
    }
}
