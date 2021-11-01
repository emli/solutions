package solutions;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CanYouReachTheEnd {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            points.add(new Point(in.nextInt(), in.nextInt()));
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean yes = false;
        for (Point point : points) {
            int sum = point.x + point.y;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        for (Point point : points) {
            int sum = point.x + point.y;
            if (point.x < n) {
                if (map.get(sum) == sum - 1) {
                    yes = true;
                    break;
                }
            }

            if (point.x == n) {
                if (map.get(sum) == n - (point.y - 1)) {
                    yes = true;
                    break;
                }
            }
        }

        if (!yes) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
