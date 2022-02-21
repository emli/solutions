package solutions;

public class TaroBalls {
    public String getWinner(int R, int B) {
        if (R == B){
            return "Friend";
        }
        return "Taro";
    }
}
