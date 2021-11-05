package solutions;

import java.util.Map;
import java.util.TreeMap;

public class EqualPiles {
    public int equalize(int N, int M, int T) {
        long[] a = new long[N];

        TreeMap<Long, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            a[i] = 1 + ((long) i * (long) i) % M;
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int best = Integer.MIN_VALUE;

        for (Map.Entry<Long, Integer> pair : map.entrySet()) {
            best = Math.max(best, pair.getValue() + Math.min(N - pair.getValue(), T));
            N -= pair.getValue();
        }


        return best;
    }
}
