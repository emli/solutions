import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class IOIGuaranteedPlace {
    public int[] solve(int N, int[] day1scores, int[] day2scores) {
        List<Pair> total = new ArrayList<>();
        int[] result = new int[N];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = day1scores[i] + day2scores[i];
            total.add(new Pair(x, i));
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int rank = 1;

        total = total.stream().sorted().collect(Collectors.toList());


        for (int i = 0; i < N; i++) {
            if (map.get(total.get(i).num) == 1) {
                result[total.get(i).pos] = rank;
            } else {
                result[total.get(i).pos] = rank + map.get(total.get(i).num);
            }
        }

        return result;
    }

}

class Pair implements Comparable<Pair> {
    Integer num;
    Integer pos;

    public Pair(Integer num, Integer pos) {
        this.num = num;
        this.pos = pos;
    }

    public int compareTo(Pair o) {
        return -num.compareTo(o.num);
    }

}
