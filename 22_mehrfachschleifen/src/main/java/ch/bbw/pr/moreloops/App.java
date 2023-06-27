package ch.bbw.pr.moreloops;

/**
 * App Klasse
 * Anwenden von mehrfachen Loops
 * und Kombination von Kontrollelementen.
 *
 * @author Peter Rutschmann
 * @author <Ihre Name>
 * @version 07.11.2021
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Mehrfach-Schleifen");

        /* 1. Ausgabe von 1x1 bis 10x10
         *==========================
         * Verwenden Sie einen Loop und innerhalb des Loops
         * einen zweiten Loop.
         */
        System.out.println("\n1x1 bis 10x10");
        int rows = 0;
        int columns = 0;
        //Hier ergänzen

        while (columns != 10) {
            columns++;
            while (rows != 10) {
                rows++;
                System.out.print(columns * rows + " ");
            }
            System.out.println();
            rows = 0;
        }

        /* 2. Ausgabe von Sternen auf einer Zeile
         *======================================
         * Verwenden Sie einen Loop, geben Sie 5 * aus.
         */
        System.out.println("\n\n5 Sterne:");
        int numberOfStars = 5;
        //Hier ergänzen
        for (int star = 1; star < numberOfStars; star++) {
            System.out.print("*");
        }


        /* 3. Ausgabe von einem Dreieck aus *
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         *    *
         *    **
         *    ***
         *    usw.
         */
        System.out.println("\n\nDreieck:");
        columns = 10;
        //Hier ergänzen
        int zahl;
        for (int i = 1; i <= columns; i++) {
            for (zahl = 1; zahl <= i; zahl++) {
                System.out.print("*");
            }
            zahl = 1;
            System.out.println();
        }

        /* 4. Gleiche Aufgabe wie zuvor
         *======================================
         * Verwenden Sie eine andere Loop-Art für die Lösung.
         *    *
         *    **
         *    ***
         *    usw.
         */
        System.out.println("\n\nDreieck, Variante 2:");
        columns = 10;
        //Hier ergänzen
        int i = 1;
        int meineZahl = 1;
        while (i <= columns) {
            while (meineZahl <= i) {
                System.out.print("*");
                meineZahl++;
            }
            meineZahl = 1;
            i++;
            System.out.println();
        }


        /* 5. Dreieck mit Abstand zum Rand
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         * Das Dreieck hat am Anfang "Leerschläge" und ist somit
         * links abgestuft und rechts bündig.
         *     *
         *    **
         *   ***
         *    usw.
         */
        System.out.println("\n\nDreieck, rechtsbündig:");
        columns = 10;
        //Hier ergänzen
        for (int dreiecksZahl = 1; dreiecksZahl <= columns; dreiecksZahl++) {
            for (int x = 10; x >= dreiecksZahl; x--) {
                System.out.print(" ");
            }
            for (int x = 1; x <= dreiecksZahl; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 6. Einfacher Tannenbaum
         *======================================
         * Verwenden Sie einen Loop und innerhalb des Loops.
         * einen zweiten Loop, um eine solche Darstellung zu erzeugen
         *
         *     *
         *    ***
         *   *****
         *    usw.
         */
        System.out.println("\n\nEinfacher Tannenbaum:");
        columns = 10;
        //Hier ergänzen
        for (int dreiecksZahl = 1; dreiecksZahl <= columns; dreiecksZahl += 2) {
            for (int x = 10; x >= dreiecksZahl; x -= 2) {
                System.out.print(" ");
            }
            for (int x = 1; x <= dreiecksZahl; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nWeihnachtsbaum mit Stamm");
        columns = 20;
        for (i = 1; i <= columns; i += 2) {
            columns++;
            for (int x = 40; x >= i; x -= 2) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 1; x <= (i / 2 - 1); x++) {
            System.out.print(" ");
        }
        System.out.println("###");

    }

}
