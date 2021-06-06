package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class COchenLegkayaZadacha {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int left = -1;
        int right = (int)1e9;

        while (left + 1 < right) {
            int m = (left + right) / 2;

            if (m / x  + m / y < n - 1){
                left = m;
            }else {
                right = m;
            }
        }

        out.println(left + Math.min(x,y));

    }
}
//
//    ll left =  0   ; // (left / w) * (left / h) < n
//    ll right = 1e18; // (right / w) * (right / h) >= n
//
//        while (left + 1 < right){
//        ll middle = left + ((right - left) / 2);
//        double x = double (middle / w ) * double(middle / h);
//        if (x < double(n)){
//        left = middle;
//        }else {
//        right = middle;
//        }
//        }
//
