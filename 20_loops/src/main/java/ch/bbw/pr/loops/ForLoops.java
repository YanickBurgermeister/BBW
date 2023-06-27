package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * For-Loops
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author Yanick Burgermeister
 * @version 05.11.2021
 */
public class ForLoops {

   /** 1. Alle Zahlen von 1 bis 50 ausgeben. */
   public List<Integer> for1to50(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //for ....
          //list.add ...
      for(int zahl = 1 ; zahl <= 50 ; zahl++) {
         list.add(zahl);
      }
      return list;
   }

   /** 2. Alle Zahlen von 0 bis 30 ausgeben. */
   public List<Integer> for0to30(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 0 ; zahl <= 30 ; zahl++) {
         list.add(zahl);
      }
      return list;
   }

   /** 3. Alle Zahlen von 50 bis 100 ausgeben. */
   public List<Integer> for50to100(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 50 ; zahl <= 100 ; zahl++) {
         list.add(zahl);
      }
      return list;
   }

   /** 4. Alle Zahlen von 40 bis 0 ausgeben. */
   public List<Integer> for40to0(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 40 ; zahl >= 0 ; zahl--) {
         list.add(zahl);
      }
      return list;
   }

   /** 5. Alle Zahlen von 200 bis 180 ausgeben. */
   public List<Integer> for200to180(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 200 ; zahl >= 180 ; zahl--) {
         list.add(zahl);
      }
      return list;
   }

   /** 6. Alle Zahlen der 2-Reihe von 2 bis 20 ausgeben. */
   public List<Integer> for2er2to20(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 2 ; zahl <= 20 ; zahl += 2) {
         list.add(zahl);
      }
      return list;
   }

   /** 7. Alle Zahlen der 7-Reihe von 7 bis 70 ausgeben. */
   public List<Integer> for7er7to70(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 7 ; zahl <= 70 ; zahl += 7) {
         list.add(zahl);
      }
      return list;
   }

   /** 8. Alle Zahlen der 12-Reihe von 60 bis 120 ausgeben. */
   public List<Integer> for12er60to120(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 60 ; zahl <= 120 ; zahl += 12) {
         list.add(zahl);
      }
      return list;
   }

   /** 9. Alle Zahlen der 5-Reihe von 125 bis 0 ausgeben. */
   public List<Integer> for5er125to0(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 125 ; zahl >= 0 ; zahl -= 5) {
         list.add(zahl);
      }
      return list;
   }

   /** 10. Alle Zahlen der 25-Reihe von 600 bis 200 ausgeben. */
   public List<Integer> for25er600to200(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 600 ; zahl >= 200 ; zahl -= 25) {
         list.add(zahl);
      }
      return list;
   }

   /** 11. Alle Zahlen der 13-Reihe von 2197 bis 2028 ausgeben. */
   public List<Integer> for13er2197to2028(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      for(int zahl = 2197 ; zahl >= 2028 ; zahl -= 13) {
         list.add(zahl);
      }
      return list;
   }
}
