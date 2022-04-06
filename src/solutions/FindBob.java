package solutions;

import java.util.HashSet;

public class FindBob {
    public int[] find(int N, int[] houses) {
        for (int i = 0; i < houses.length; i++){
            if (houses[i] != -1){
                HashSet<Integer> hashSet = new HashSet<>();
                if (i + houses[i] < N){
                    hashSet.add(i + houses[i]);
                }

                if (i - houses[i] >= 0){
                    hashSet.add(i - houses[i]);
                }



                for (int j = 0; j < houses.length; j++) {
                    if (houses[j] != -1 && j != i){
                        if (j + houses[j] < N && !hashSet.contains(j + houses[j])){
                            hashSet.add(i + houses[i]);
                        }
                    }
                }
            }
        }
        return new int[0];
    }
}
