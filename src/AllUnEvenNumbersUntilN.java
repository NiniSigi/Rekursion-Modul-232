

public class AllUnEvenNumbersUntilN {
    public static void iterativUnEvenNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void rekursivUnEvenNumbers(int n) {
        rekursivUnEvenNumbers(n, 0);
    }

    public static void rekursivUnEvenNumbers(int n, int temp) {
        if (n == temp) {
            System.out.println(temp);
            return;
        }
        if (temp % 2 == 0) System.out.println(temp);
        temp++;
        rekursivUnEvenNumbers(n, temp);
    }
}
