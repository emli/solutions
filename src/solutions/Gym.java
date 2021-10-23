package solutions;

import java.util.PriorityQueue;

public class Gym {
    public int calculateProfit(int m, int n, int t) {
        if (m >= n) {
            return n;
        }


        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();


        long ans = 0;
        for (long i = 0; i < n; i++) {

            double e = i + 0.5 + (i * i) % t;
            if (m > 0) {
                priorityQueue.add(e);
                m--;
                ans++;
            } else {
                if (priorityQueue.size() > 0 && (double) i >= priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.add(e);
                    ans++;
                }
            }
        }
        return (int) ans;
    }
}
