
class Solution {
    public boolean canAliceWin(int n) {
        int turn = 10;
        boolean alice = true;

        while (n >= turn) {
            n -= turn;
            turn--;
            alice = !alice;
        }

        return !alice;
    }
}
