package solutions;

public class SubtractionGenerator {
    public int[] generate(int result) {
        int x = result;
        int t = 0;
        while (result > 0){
            result /= 10;
            t = t * 10 + 9;
        }
        return new int[]{x + t,t};
    }
}
