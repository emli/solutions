package solutions;

import java.util.HashSet;
import java.util.Set;

public class SudokuTypo {
    public int fix(int[] digits) {
        int[][] a = new int[9][9];

        int pos = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = digits[pos++];
            }
        }


        for (int i = 0; i < 9; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                integers.add(a[i][j]);
            }
            if (integers.size() != 9) {
                for (int j = 1; j <= 9; j++) {
                    if (!integers.contains(j)) {
                        return j;
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                integers.add(a[j][i]);
            }
            if (integers.size() != 9) {
                for (int j = 1; j <= 9; j++) {
                    if (!integers.contains(j)) {
                        return j;
                    }
                }
            }
        }


        return 0;
    }
}
