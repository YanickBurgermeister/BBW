package ch.bbw.yb;

import java.util.ArrayList;
import java.util.List;

/**
 * App
 * @author Yanick Burgermeister
 * @version 04.10.2022
 *
 */
public class App {
    public static void main( String[] args ) {
        Land Schweiz = new Land("100000km²", 250, "Schweiz");
        System.out.println(Schweiz);

        System.out.println(Schweiz.getName()+"\n");

        Land Deutschland = new Land();

        Deutschland.setFläche("400000km²");
        Deutschland.setAlter(1740);
        Deutschland.setName("Deutschland");

        List<Land> meineLänder = new ArrayList<>();
        meineLänder.add(Schweiz);
        meineLänder.add(Deutschland);

        System.out.println(meineLänder);
    }
}
