package März_07_2025;

public class ZeichenZeichnen {
    public static void iterativZeichenZeichnen(int anzahl) {
        for (int i = 0; i <= anzahl-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void rekursivZeichenZeichnen(int anzahl){
        rekursivZeichenZeichnen(anzahl, 0);
    }
    public static void rekursivZeichenZeichnen(int anzahl,int counted){
        if(anzahl<counted) return;
        innerLoopRekursivZeichenZeichnen(counted);
        System.out.print("\n");
        rekursivZeichenZeichnen(anzahl,counted+1);
    }
    private static void innerLoopRekursivZeichenZeichnen(int anzahl){
        if(anzahl==0) return;
        System.out.print("*");
        innerLoopRekursivZeichenZeichnen(anzahl-1);
    }
}
