package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * WhileLoops
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author Yanick Burgermeister
 * @version 05.11.2021
 */
public class WhileLoops {

   /** 1. Alle Zahlen von 0 bis 20 ausgeben. */
   public List<Integer> while0to20(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //while ....
          //list.add ...
      int zahl = 0;
      while(zahl <= 20){
         list.add(zahl);
         zahl++;
      }
      return list;
   }

   /** 2. Alle Zahlen von 25 bis 50 ausgeben. */
   public List<Integer> while25to50(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 25;
      while(zahl <= 50){
         list.add(zahl);
         zahl++;
      }
      return list;
   }

   /** 3. Alle Zahlen von -25 bis 25 ausgeben. */
   public List<Integer> whileM25to25(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = -25;
      while(zahl <= 25){
         list.add(zahl);
         zahl++;
      }
      return list;
   }

   /** 4. Alle Zahlen der 4-Reihe von 4 bis 40 ausgeben. */
   public List<Integer> while4er4to40(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 4;
      while(zahl <= 40){
         list.add(zahl);
         zahl += 4;
      }
      return list;
   }

   /** 5. Alle Zahlen der 9-Reihe von 9 bis 81 ausgeben. */
   public List<Integer> while9er9to81(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 9;
      while(zahl <= 81){
         list.add(zahl);
         zahl += 9;
      }
      return list;
   }

   /** 6. Alle Zahlen der 11-Reihe von 44 bis 121 ausgeben. */
   public List<Integer> while11er44to121(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 44;
      while(zahl <= 121){
         list.add(zahl);
         zahl += 11;
      }
      return list;
   }

   /** 7. Alle Zahlen der 8-Reihe von 96 bis 16 ausgeben. */
   public List<Integer> while8er96to16(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 96;
      while(zahl >= 16){
         list.add(zahl);
         zahl -= 8;
      }
      return list;
   }

   /** 8. Alle Zahlen der 25-Reihe von 400 bis 100 ausgeben. */
   public List<Integer> while25er400to100(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 400;
      while(zahl >= 100){
         list.add(zahl);
         zahl -= 25;
      }
      return list;
   }

   /** 9. Alle Zahlen der 13-Reihe von 2197 bis 2028 ausgeben. */
   public List<Integer> while13er2197to2028(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 2197;
      while(zahl >= 2028){
         list.add(zahl);
         zahl -= 13;
      }
      return list;
   }
}
