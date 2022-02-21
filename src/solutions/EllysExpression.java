package solutions;

import java.util.*;

public class EllysExpression {
    public int getMax(int[] numbers, int numPluses, int numMinuses) {
        Integer[] t = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            t[i] = numbers[i];
        }
        Arrays.sort(t, Comparator.comparingInt(Math::abs));
        Collections.reverse(Arrays.asList(t));

        int sum = 0;

        ArrayList<Boolean> used = new ArrayList<>();

        numPluses++;
        for (int i = 0; i < t.length; i++) {
            used.add(false);
        }

        for (int i = 0; i < t.length; i++) {
            if (t[i] < 0 && numMinuses > 0){
                sum += Math.abs(t[i]);
                numMinuses--;
                used.set(i,true);
            }else if (t[i] >=0 && numPluses > 0){
                sum += Math.abs(t[i]);
                numPluses--;
                used.set(i,true);
            }
        }

        for (int i = 0; i < t.length; i++) {
            if (!used.get(i) && t[i] > 0 && numPluses > 0){
                sum += t[i];
                used.set(i,true);
            }
        }



        for (int i = 0; i < t.length; i++) {
            if (!used.get(i) ){
                sum += -t[i];
            }
        }
            return sum;
    }
}
