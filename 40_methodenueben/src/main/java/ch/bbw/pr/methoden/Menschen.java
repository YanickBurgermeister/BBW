package ch.bbw.pr.methoden;

/**
 * Menschen
 *
 * @author Peter Rutschmann
 * @version 03.01.2022
 */
public class Menschen {
    public String getNamePlusAlter(String name, int alter){
        String alterString = String.valueOf(alter);
        return name + ": " + alterString + " Jahre alt";
    }

    public int bevoelkerungsAnteil(int anzahlBewohner, double anteil){
        int bevoelkerungsanteil = (int) (anzahlBewohner * anteil);
        return bevoelkerungsanteil;
    }

    public float ausbreitung(float value, boolean isRadius){
        if(!isRadius){
            value = value / 2;
        }
        return (float) (value * value * 3.141);
    }
}
