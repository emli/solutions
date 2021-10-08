package solutions;

import java.util.Arrays;
import java.util.HashSet;

public class DevuAndRabbitNumbering {
    public String canRenumber(int[] rabbitIds) {
        Arrays.sort(rabbitIds);

        int left = 0;
        int right = rabbitIds.length - 1;

        HashSet<Integer> set = new HashSet<>();
        while (left < right){
            if (!set.contains(rabbitIds[left] - 1)){
                set.add(rabbitIds[left] - 1);
                left++;
            }else if (!set.contains(rabbitIds[left])){
                set.add(rabbitIds[left]);
                left++;
            } else {
                return "cannot";
            }

            if (!set.contains(rabbitIds[right] + 1)){
                set.add(rabbitIds[right] + 1);
                right--;
            }else if (!set.contains(rabbitIds[right])){
                set.add(rabbitIds[right]);
                right--;
            }else {
                return "cannot";
            }
        }
        return "can";
    }
}
