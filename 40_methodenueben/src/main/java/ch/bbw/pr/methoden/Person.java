package ch.bbw.pr.methoden;

/**
 * Person
 *
 * @author Peter Rutschmann
 * @version 03.01.2022
 */
public class Person {
   private String name;

   public Person(String name) {
      this.name = name;
   }

   public void printName(){
      System.out.println("Mein Name ist: "+ name);
   }

   public int getAlter(int geburtsjahr, int jahreszahl){
      return jahreszahl-geburtsjahr;
   }
}
