package solutions;

import java.util.Arrays;
import java.util.HashMap;

public class AssignPoints {
    public int[] assign(int N, int[] results) {
        int[] a = results.clone();
        Arrays.sort(results);
        int[] ans = new int[results.length];

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int result : results) {
            if (result != -1 && map.containsKey(result)) {
                N--;
            } else if (result != -1){
                map.put(result, N);
                N--;
            }
        }

        for (int i = 0; i < a.length; i++){
            ans[i] = map.getOrDefault(a[i], 0);
        }

        return ans;
    }
}
