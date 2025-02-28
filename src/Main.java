import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        callQuickSort();
        callAdditionUntilN();
        callAllUnEvenNumbers();
        callEinMalEins();
    }

    public static void callQuickSort() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 3, 5, 10, 325, 32131, 3, 1, 23413, 2, 999, 1000, 2024, 88, 77, 66, 55, 44));
        System.out.println(QuickSort.quickSort(array));
    }

    public static void callAdditionUntilN() {
        int n = 5;
        System.out.println(AdditionUntilN.iterativDreickzahl(n));
        System.out.println(AdditionUntilN.rekursivDreickzahl(n));
    }

    public static void callAllUnEvenNumbers() {
        int n = 10;
        AllUnEvenNumbersUntilN.iterativUnEvenNumbers(n);
        AllUnEvenNumbersUntilN.rekursivUnEvenNumbers(n);
    }

    public static void callEinMalEins() {
        int reihe = 5;
        EinMalEins.iterativEinMalEins(reihe);
        EinMalEins.rekursivesEinMalEins(reihe);
    }
}