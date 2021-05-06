package solutions;

import java.util.*;
import java.io.PrintWriter;

public class BZauryadnieChisla {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < 9; j++){
                s.append(i);
                if (Integer.parseInt(String.valueOf(s)) <= 1e9){
                    a.add(Integer.parseInt(String.valueOf(s)));
                }
            }
        }
        Collections.sort(a);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            solve(a,n,out);
        }


    }

    private void solve(ArrayList<Integer> a, int n,PrintWriter out) {
        int c = 0;
        for(Integer num : a){
            if (num <= n){
                c++;
            }
        }
        out.println(c);
    }
}
