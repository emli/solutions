package solutions;

public class OptimalMemoryGame {
    public int findPairs(String known) {
        int ans = 0;
        int letters = 0;
        for (char x = 'A'; x <= 'Z'; x++){
            char finalX = x;
            int y = (int) known.chars().filter(e -> e == finalX).count();
            if (y == 2){
                ans++;
                letters += 2;
            }
        }

        long l = known.chars().filter(Character::isLetter).count() - letters;
        long x = known.chars().filter(e -> !Character.isLetter(e)).count();

        if (x == l && x == 1){
            ans++;
        }
        return ans;
    }
}
