package testklasmata;

import java.util.Scanner;

public class TestKlasmata {

    public static void main(String args[]) {
        int a, b, c, d;
        int e = 0;
        Klasma k1, k2, k3, k4, k5, k6, k7;
        Scanner sc = new Scanner(System.in);

        System.out.println("Δώσε το 1o κλάσμα");
        System.out.println("Δώσε τον αριθμητή :");
        a = sc.nextInt();
        System.out.print("Δώσε τον παρονομαστή :");
        b = sc.nextInt();

        k1 = new Klasma();
        k1.setKlasma(a, b);

        System.out.println("Δώσε το 2o κλάσμα");
        System.out.println("Δώσε τον αριθμητή :");
        c = sc.nextInt();
        System.out.print("Δώσε τον παρονομαστή :");
        d = sc.nextInt();

        k2 = new Klasma();
        k2.setKlasma(c, d);

        while (true) {
            System.out.println("1. Prosthesi + \n2. Afairesi - \n3. Pollaplasiasmos * \n4.Diairesi / \n5.exit");
            e = sc.nextInt();
            switch (e) {
                case 1:
                    k3 = k1.prosthesi(k2);
                    break;
                case 2:
                    k4 = k1.aferesi(k2);
                    break;
                case 3:
                    k5 = k1.polapla(k2);
                    break;
                case 4:
                    k6 = k1.diaresi(k2);
                    break;
                case 5:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
