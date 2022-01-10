package solutions;

import java.util.*;

class Attack {
    int value;
    int x,y;

    public Attack(int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }
}
class AttackComparator implements Comparator<Attack> {

    @Override
    public int compare(Attack o1, Attack o2) {
        if (o1.value < o2.value){
            return 1;
        }else if (o1.value > o2.value){
            return -1;
        }
        return 0;
    }
}

class P implements Comparable<Pair>{
    Integer num;
    Integer pos;

    public P(Integer num, Integer pos) {
        this.num = num;
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P p = (P) o;
        return Objects.equals(num, p.num) && Objects.equals(pos, p.pos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, pos);
    }

    @Override
    public int compareTo(Pair o) {
        return -num.compareTo(o.num);
    }
}
public class OneBattleship {
    public String[] hit(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();

        int[] count = new int[3];
        int cur = 0;
        char[][] ch = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ch[i][j] = grid[i].charAt(j);
                if (ch[i][j] == '.'){
                    count[(i + j) % 3]++;
                }
             }
        }

        int pos = 0;

        for (int i = 0; i < 3; i++) {
            if (count[i] < count[pos]){
                pos = i;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ch[i][j] = grid[i].charAt(j);
                if (ch[i][j] == '.' && (i + j) % 3 == pos){
                    ch[i][j] = '*';
                }
            }
        }

        String[] ans = new String[grid.length];


        for (int i = 0; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < m; j++) {
                tmp.append(ch[i][j]);
            }
            ans[i] = tmp.toString();
        }
        return ans;
    }
}
