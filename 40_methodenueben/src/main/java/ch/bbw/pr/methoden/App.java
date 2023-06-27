package ch.bbw.pr.methoden;

/**
 * App
 * @author Peter Rutschmann
 * @version 03.01.2022
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Implementieren Sie Methoden, Parameter, Returnwerte und Aufrufe." );

        //Vertiefungsübung Methoden Teil 1
        System.out.println( "Vertiefungsübung Methoden Teil 1" );
        Person myPerson = new Person("Paul Muster");
        myPerson.printName();
        int alter = myPerson.getAlter(2000, 2022);
        System.out.println("Mein Alter beträgt: " + alter + " Jahre.");

        //Vertiefungsübung Methoden Teil 2
        // Aufruf der Methoden zur Klasse Auto
        System.out.println( "\nVertiefungsübung Methoden Teil 2" );
        Auto myAuto = new Auto();
        int ps = myAuto.changeKilowattToPS(3443);
        System.out.println(ps);


        //Vertiefungsübung Methoden Teil 3
        // Aufruf der Methoden zur Klasse Menschen
        System.out.println( "\nVertiefungsübung Methoden Teil 3" );
        Menschen mensch = new Menschen();
        System.out.println(mensch.getNamePlusAlter("Paul", 15));
        System.out.println(mensch.bevoelkerungsAnteil(15000, 0.5));
        System.out.println(mensch.ausbreitung(500, true));

    }
}
