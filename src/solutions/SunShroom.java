package solutions;

public class SunShroom {
    public long produceSun(long[] plantingTime, long queryTime) {
        int n = plantingTime.length;
        long ans = 0;
        for (long ptime : plantingTime) {
            long d = queryTime - ptime;

            if (d > 0) {
                long x = d / 24;

                if (x >= 4) {
                    ans += 4 * 15 + (x - 4) * 25;
                } else {
                    ans += x * 15;
                }
            }
        }
        return ans;
    }
}
