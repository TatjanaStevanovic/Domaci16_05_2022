import java.util.ArrayList;
import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        System.out.println(dodaj());


    }

    public static ArrayList<String> dodaj() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> zivotinje = new ArrayList<>();
        System.out.println("Unesi broj clanova liste:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi ime zivotinje:");
            String x = sc.next();
            zivotinje.add(x);

        }
        System.out.println("Imena zivotinja su:");
        return zivotinje;





    }
}

