package ch.bbw.luckynumber;

import java.util.*;

/**
 * LuckyNumber
 * Fachklasse für das Berechnen von Glueckszahlen
 *
 * @author Peter Rutschmann
 * @date 06.09.2021
 */
public class LuckyNumber {
    Random random = new Random();

    public int singleDice() {
        int value = 0;
        value = (int) (Math.random() * 6);
        value = value + 1;

        return value;
    }

    public List<Integer> doubleDice() {
        List<Integer> list = new ArrayList<>();
        list.add((int) (Math.random() * 6 + 1));
        list.add((int) (Math.random() * 6 + 1));


        return list;
    }

    public boolean trueOrFalse() {
        boolean truefalse = random.nextBoolean();
        return truefalse;
    }

    public Set<Integer> sixLottoNumbers() {
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() < 6) {
            set.add((int) (Math.random() * 41 + 1));
        }
        return set;
    }

    public String playingCard() {
        String farbe = "";
        String[] values = {"Herz", "Karo", "Pik", "Kreuz"};
        int zufallszahl = (int) (Math.random() * 4);
        int zufallszahl2 = (int) (Math.random() * 9 + 2);
        String value = values[zufallszahl];
        if (value.equals("Herz") || value.equals("Karo")) {
            farbe = "Rot";
        } else {
            farbe = "Schwarz";
        }
        String ausgabe = farbe + ", " + value + ", " + zufallszahl2;

        return ausgabe;
    }

    public List<Integer> primeUpTo100() {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        boolean prim = true;
        while (i <= 100) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    prim = false;
                }
            }
            if (prim) {
                list.add(i);
            } else {
                prim = true;
            }

            i++;

        }

        return list;
    }

    public int primeNextTo(int value) {

        for (int value2 = value - 1; value2 > 0; value2--) {
            boolean primzahl = true;
            for (int value3 = 2; value3 < value2 && primzahl; value3++) {
                if (value2 % value3 == 0) {
                    primzahl = false;
                }
            }
            if (primzahl) {
                return value2;
            }


        }
        return value;
    }

    public List<Integer> triangleNumbersUpTo(int value) {
        List<Integer> list = new ArrayList<Integer>();
        int zahl = 1;
        int summe = 0;
        while (zahl <= value) {
            summe = summe + zahl;
            list.add(summe);
            zahl++;
        }

        return list;
    }
}
