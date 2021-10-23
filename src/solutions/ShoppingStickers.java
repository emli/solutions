package solutions;

import java.util.Arrays;

public class ShoppingStickers {
    public int[] purchase(int S, int[] items) {
        int sum = Arrays.stream(items).sum();

        int bob = 0;

        for (int i = 0; i < items.length; i++) {
            bob += items[i] / S;
        }
        int[] ans = new int[2];
        ans[0] = sum / S;
        ans[1] = bob;
        return ans;
    }
}
