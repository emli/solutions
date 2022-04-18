package solutions;

import java.util.ArrayList;
import java.util.Collections;

public class SkyscraperReconstruction {
    public int[] reconstruct(String visibility) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = visibility.length();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        int[] a = new int[n];

        for (int i = visibility.length() - 1; i >= 0; i--) {
            if (visibility.charAt(i) == 'O'){
                a[i] = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
            }
        }

        Collections.reverse(numbers);

        for (int i = visibility.length() - 1; i >= 0; i--) {
            if (visibility.charAt(i) == 'X'){
                a[i] = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
            }
        }
        return a;
    }
}
