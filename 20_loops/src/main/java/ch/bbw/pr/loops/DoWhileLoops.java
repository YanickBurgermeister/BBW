package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * Do-WhileLoops
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author Yanick Burgermeister
 * @version 05.11.2021
 */
public class DoWhileLoops {

   /** 1. Alle Zahlen von 0 bis 20 ausgeben. */
   public List<Integer> doWhile0to20(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //do ....
          //list.add ...
      //while ...
      int zahl = 0;
      do{
         list.add(zahl);
         zahl++;
      }while(zahl <= 20);
      return list;
   }

   /** 2. Alle Zahlen von 25 bis 50 ausgeben. */
   public List<Integer> doWhile25to50(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 25;
      do{
         list.add(zahl);
         zahl++;
      }while(zahl <= 50);
      return list;
   }

   /** 3. Alle Zahlen von -25 bis 25 ausgeben. */
   public List<Integer> doWhileM25to25(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = -25;
      do{
         list.add(zahl);
         zahl++;
      }while(zahl <= 25);
      return list;
   }

   /** 4. Alle Zahlen der 4-Reihe von 4 bis 40 ausgeben. */
   public List<Integer> doWhile4er4to40(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 4;
      do{
         list.add(zahl);
         zahl += 4;
      }while(zahl <= 40);
      return list;
   }

   /** 5. Alle Zahlen der 9-Reihe von 9 bis 81 ausgeben. */
   public List<Integer> doWhile9er9to81(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 9;
      do{
         list.add(zahl);
         zahl += 9;
      }while(zahl <= 81);
      return list;
   }

   /** 6. Alle Zahlen der 11-Reihe von 44 bis 121 ausgeben. */
   public List<Integer> doWhile11er44to121(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 44;
      do{
         list.add(zahl);
         zahl += 11;
      }while(zahl <= 121);
      return list;
   }

   /** 7. Alle Zahlen der 8-Reihe von 96 bis 16 ausgeben. */
   public List<Integer> doWhile8er96to16(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 96;
      do{
         list.add(zahl);
         zahl -= 8;
      }while(zahl >= 16);
      return list;
   }

   /** 8. Alle Zahlen der 25-Reihe von 400 bis 100 ausgeben. */
   public List<Integer> doWhile25er400to100(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 400;
      do{
         list.add(zahl);
         zahl -= 25;
      }while(zahl >= 100);
      return list;
   }

   /** 9. Alle Zahlen der 13-Reihe von 2197 bis 2028 ausgeben. */
   public List<Integer> doWhile13er2197to2028(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      int zahl = 2197;
      do{
         list.add(zahl);
         zahl -= 13;
      }while(zahl >= 2028);
      return list;
   }
}
