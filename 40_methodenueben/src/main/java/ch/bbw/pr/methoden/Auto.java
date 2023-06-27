package ch.bbw.pr.methoden;

/**
 * Auto
 *
 * @author Peter Rutschmann
 * @version 03.01.2022
 */
public class Auto {
    public float getMaximaleDrehzahl(){
        return 6436;
    }

    public double getLeistung(double drehzahl, double drehmoment){
        return drehzahl + drehmoment;
    }

    public int getReichweite(double tankinhalt, float verbrauch){
        int reichweite = (int) (tankinhalt * 100 / verbrauch);
        return reichweite;
    }

    public int changeKilowattToPS(int kilowatt){
        int umgerechnet = (int) (kilowatt * 1.4);
        return umgerechnet;
    }
}
