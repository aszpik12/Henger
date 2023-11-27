package henger;

public class Henger {

    private static int hengerDarab;
    private double sugar, magassag;

    public Henger(double r, double m) {
        this.sugar = r;
        this.magassag = m;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugat() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return Math.pow(sugar, sugar)*Math.PI*magassag;
    }
;

}
