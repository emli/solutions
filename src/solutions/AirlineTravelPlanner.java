package solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AirlineTravelPlanner {
    public int shortestDistance(int start, int end, String[] dist) {

        LinkedList<Integer> queue = new LinkedList<Integer>();

        queue.add(start);

        int[] dis = new int[dist.length + 1];
        Arrays.fill(dis, Integer.MAX_VALUE / 2);

        dis[start] = 0;

        while (!queue.isEmpty()){
            int cur = queue.poll();

            for (int i = 0; i < dist.length; i++) {
                int to = dist[cur].charAt(i) - '0';

                if (to != 0 && dis[cur] + to < dis[i]){
                    dis[i] = dis[cur] + to;
                    queue.add(i);
                }
            }
        }

        return dis[end] == Integer.MAX_VALUE / 2 ? -1 : dis[end];
    }
}
