package solutions;

public class CheckbookRegister {
    public int updateBalance(int startingBalance, int debits, int checks) {

        return startingBalance - debits - checks;
    }
}
