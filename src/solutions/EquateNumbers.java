package solutions;

import java.util.Arrays;

public class EquateNumbers {
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public String canMakeEqual(int[] A) {
        if (Arrays.stream(A).distinct().count() <= 1){
            return "yes";
        }

        int first = A[0];

        for (int i = 1; i < A.length; i++) {
            first  = gcd(first,A[i]);
        }

        return first == 1 ? "no" : "yes";
    }
}
