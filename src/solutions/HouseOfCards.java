package solutions;

public class HouseOfCards {
    public long count(int N) {
        long sum = 0;
        long block = 2;
        long line = 0;
        for (int i = 1; i <= N; i++) {
            sum += block + line;
            line++;
            block += 2;
        }
        return sum;
    }
}
