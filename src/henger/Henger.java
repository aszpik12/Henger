package henger;

public class Henger {

    private static int hengerDarab;
    private double sugat, magassag;

    public Henger(double r, double m) {
        this.sugat = r;
        this.magassag = m;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugat() {
        return sugat;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {

        return 1;
    }
;

}
