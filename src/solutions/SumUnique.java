package solutions;

import java.util.Arrays;

public class SumUnique {
    public int getSum(int[] values) {
        return Arrays.stream(values).distinct().sum();
    }
}
