package henger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    
    List hengerek;
    
    public static void main(String[] args) {

        new HengerProgram().run();

    }

    public void run() {
        lista();
        
        int db = Henger.getHengerDarab();
        double atlag = atlagTerfogat();
        double csovekS =  csovekSulya();
        System.out.println("A programban " + db + " db henger van.");
        System.out.println("átlag térfogata= " + atlag + ".");
        System.out.println("csövek súlya= " + csovekS + ".");
    }

    public double atlagTerfogat() {
       
        return 1;
    }

    public double csovekSulya() {

        return 1;
    }

    private List<Henger> lista() {
        hengerek = new ArrayList<>();
        hengerek.add(new Henger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new Cso(1, 1, .5));
        hengerek.add(new Cso(1, 1, .1));
        return null;
    }

}
