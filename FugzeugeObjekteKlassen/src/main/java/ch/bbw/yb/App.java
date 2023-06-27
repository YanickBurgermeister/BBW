package ch.bbw.yb;

import java.util.ArrayList;
import java.util.List;
/**
 * App
 * @author Yanick Burgermeister
 * @version 26.09.2022
 */

public class App {
    public static void main(String[] args) {
    Flugzeug A380 = new Flugzeug("Airbus 380", "1185", "13100");
    Flugzeug B777 = new Flugzeug();

    B777.setmodel("Boeing 777");
    B777.setMaxGeschwindigkeit("945");
    B777.setMaxFlughöhe("10700");

    List<Flugzeug> meineFlugzeuge = new ArrayList<>();
    meineFlugzeuge.add(A380);
    meineFlugzeuge.add(B777);

    System.out.println(meineFlugzeuge);
    }
}
