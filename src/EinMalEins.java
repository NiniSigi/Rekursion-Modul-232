public class EinMalEins {

    public static void iterativEinMalEins(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void rekursivesEinMalEins(int n) {
        rekursivesEinMalEins(n,0);
    }

    public static void rekursivesEinMalEins(int n, int temp) {
        if (10== temp) {
            System.out.println(temp*n);
            return;
        }
        System.out.println(temp * n);
        temp++;
        rekursivesEinMalEins(n, temp);
    }
}
