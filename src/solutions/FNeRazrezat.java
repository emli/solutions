package solutions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FNeRazrezat {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int[]a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        if (n % 2 == 1){
            System.out.println("NO");
            return;
        }

        Arrays.sort(a);

        int mn = a[0];

        for (int i = 0; i < n / 2; i++) {
            if (mn != a[i]){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }
}
