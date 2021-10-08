import java.util.HashSet;
import java.util.Arrays;

public class DevuAndRabbitNumbering {
    public String canRenumber(int[] rabbitIds) {
        Arrays.sort(rabbitIds);

        HashSet<Integer> set = new HashSet<>();

        for (int rabbitId : rabbitIds) {
            if (!set.contains(rabbitId - 1)) {
                set.add(rabbitId - 1);
            } else if (!set.contains(rabbitId)) {
                set.add(rabbitId);
            } else if (!set.contains(rabbitId + 1)) {
                set.add(rabbitId + 1);
            } else {
                return "cannot";
            }
        }
        return "can";
    }

}
