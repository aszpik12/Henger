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
        double belsosugar= getSugar()-falvastagsag;
        double kulso = Math.pow(getSugar(), 2)*Math.PI*getMagassag();
        double belso = Math.pow(belsosugar, 2)*Math.PI*getMagassag();
        return kulso-belso;
    }

    @Override
    public double suly() {
        return super.suly(); 
    }
    
    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + "súly=" + suly() +'}';
    }
}
