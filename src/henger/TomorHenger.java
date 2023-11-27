package henger;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double r, double m) {
        this(1, r, m);
    }

    public TomorHenger(double fajsuly, double r, double m) {
        super(r, m);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        
        return terfogat()*fajsuly;
    }

    @Override
    public double terfogat() {
        return super.terfogat(); 
    }
    
    
    
    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + "térfogat=" + terfogat() +'}';
    }

}
