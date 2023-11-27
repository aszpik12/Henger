package henger;

import java.util.List;

public class HengerProgram {

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

    private List lista() {

        return null;
    }

}
