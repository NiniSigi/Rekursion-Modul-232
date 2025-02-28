public class AdditionUntilN {

    public static int iterativDreickzahl(int end) {
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static int rekursivDreickzahl(int end) {
        return rekursivDreickzahl(end, 0);
    }

    public static int rekursivDreickzahl(int end, int sum) {
        if (end == 0) return sum;
        sum += end;
        return rekursivDreickzahl(end - 1, sum);
    }
}
