package ch.bbw.pr.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * SequenceOfNumbers
 *   Weitere Zahlenreihen
 *   Methoden gemäss Anforderung implementieren.
 *   Unittest ausführen.
 * @author Peter Rutschmann
 * @author <hier Ihren Namen eintragen>
 * @version 05.11.2021
 */
public class SequenceOfNumbers {

   /** 1. For-Loop: Alle Quadratzahlen für die Zahlen 1 bis 5*/
   public List<Integer> forQuadrat1to5(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //for ....
          //list.add ...
      for(int zahl = 1 ; zahl <= 5 ; zahl++){
         list.add(zahl * zahl);
      }
      return list;
   }

   /** 2. While-Loop: Alle Quadratzahlen für die Zahlen 5 bis 10*/
   public List<Integer> whileQuadrat5to10(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //while ....
          //list.add ...
      int zahl = 5;
      while(zahl <= 10){
         list.add(zahl * zahl);
         zahl++;
      }
      return list;
   }

   /** 3. Do While-Loop: Alle Quadratzahlen für die Zahlen 10 bis 15*/
   public List<Integer> doWhileQuadrat10to15(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
      //do
      //list.add ...
          //while ....
      int zahl = 10;
      do{
         list.add(zahl * zahl);
         zahl++;
      }while(zahl <= 15);
      return list;
   }

   /** 4. Alle Quadratzahlen zwischen 1 und 1000
    * Das Ergebnis liegt zwischen 1 und 1000, inkl. Grenzen
    */
   public List<Integer> quadratRange1to1000(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
         //list.add ...
      int zahl = 1;
      while(zahl * zahl >= 1 && zahl * zahl <= 1000){
         list.add(zahl * zahl);
         zahl++;
      }
      return list;
   }

   /** 5. Alle Kubikzahlen für die Zahlen 1 bis 10
    *  Den Loop können Sie frei wählen
    */
   public List<Integer> kubik1to10(){
      List<Integer> list = new ArrayList<>();
      //hier loop ergänzen
         //list.add ...
      int zahl = 1;
      while(zahl <= 10){
         list.add(zahl * zahl * zahl);
         zahl++;
      }
      return list;
   }
}
