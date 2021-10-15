package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Distraction {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char x = (char) ('a' + i);
            stack.add(x);
        }

        ArrayList<Character> ans = new ArrayList<>();

        while (t >= n){
            ans.add(stack.get(stack.size() - 1));

            ArrayList<Character> tmp = new ArrayList<>();

            for (int i = 0; i < stack.size() - 1; i++) {
                tmp.add(stack.get(i));
            }

            Character lastOne = stack.get(stack.size() - 1);

            stack.clear();

            stack.add(lastOne);

            stack.addAll(tmp);

            t -= n;
        }

        if (t > 0){
            ans.add(stack.get(t - 1));
        }

        out.println(ans.size());

        for (Character an : ans) {
            out.print(an + " ");
        }
    }
}
