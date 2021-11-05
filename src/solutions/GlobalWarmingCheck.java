package solutions;

class Answer {
    long value;
    int pos;

    public Answer(long value, int pos) {
        this.value = value;
        this.pos = pos;
    }
}

public class GlobalWarmingCheck {
    public int[] solve(int N, int M, int Y) {
        long[] a = new long[N];

        for (long i = 0; i < N; i++) {
            a[(int) i] = (i * i + 4 * i + 7) % M;
        }


        long sum = 0;

        int i = 0;
        for (; i < Y; i++) {
            sum += a[i];
        }

        Answer best = new Answer(Long.MIN_VALUE, -1);
        Answer worst = new Answer(Long.MAX_VALUE, -1);

        if (sum > best.value) {
            best.value = sum;
            best.pos = 0;
        }

        if (sum < worst.value) {
            worst.value = sum;
            worst.pos = 0;
        }

        int pos = 0;
        for (; i < N; i++) {
            sum -= a[pos];
            sum += a[i];

            if (sum >= best.value) {
                best.value = sum;
                best.pos = pos + 1;
            }

            if (sum < worst.value) {
                worst.value = sum;
                worst.pos = pos + 1;
            }
            pos++;
        }

        return new int[]{worst.pos, best.pos};
    }
}
