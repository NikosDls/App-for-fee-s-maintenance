package testklasmata;

public class Klasma {

    private int arith;
    private int paro;

    public void Klasma() {
        setKlasma(0, 1);
    }

    public void setKlasma(int ari, int par) {
        if (par == 0) {
            paro = 1;
        } else {
            paro = par;
        }
        arith = ari;
    }

    public Klasma prosthesi(Klasma d2) {
        Klasma temp = new Klasma();
        double x;
        temp.arith = (arith * d2.paro) + (paro * d2.arith);
        temp.paro = paro * d2.paro;
        x = (double)temp.arith / temp.paro;
        System.out.println(temp.arith + "/" + temp.paro + " = " + x);
        return temp;
    }

    public Klasma aferesi(Klasma d2) {
        Klasma temp = new Klasma();
        double x;
        temp.arith = (arith * d2.paro) - (paro * d2.arith);
        temp.paro = paro * d2.paro;
        x = (double)temp.arith / temp.paro;
        System.out.println(temp.arith + "/" + temp.paro + " = " + x);
        return temp;
    }

    public Klasma polapla(Klasma d2) {
        Klasma temp = new Klasma();
        double x;
        temp.arith = arith * d2.arith;
        temp.paro = paro * d2.paro;
        x = (double)temp.arith / temp.paro;
        System.out.println(temp.arith + "/" + temp.paro + " = " + x);
        return temp;
    }

    public Klasma diaresi(Klasma d2) {
        Klasma temp = new Klasma();
        double x;
        temp.arith = arith * d2.paro; 
        temp.paro = paro * d2.arith;
        x = (double) temp.arith / temp.paro;
        System.out.println(temp.arith + "/" + temp.paro + " = " + x);
        return temp;
    }
}
