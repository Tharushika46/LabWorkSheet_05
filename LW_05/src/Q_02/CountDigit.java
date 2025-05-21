package Q_02;

public class CountDigit {
    public static int CountDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;

    }
}
