package henger;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double falvastagsag, double r, double m) {
        this(falvastagsag, 1, r, m);
    }

    public Cso(double falvastagsag, double fajsuly, double r, double m) {
        super(fajsuly, r, m);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {

        return 1;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
}
