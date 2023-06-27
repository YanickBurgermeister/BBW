package ch.bbw.pr.loops;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SequenceOfNumbersTest extends TestCase {
   private SequenceOfNumbers testee;

   @Before
   public void setUp() throws Exception {
      testee = new SequenceOfNumbers();
   }

   @After
   public void tearDown() throws Exception {
      testee = null;
   }

   public void testForQuadrat1to5() {
      System.out.println("SequenceOfNumbersTest.forQuadrat1to5");
      List<Integer> list = testee.forQuadrat1to5();
      List<Integer> pattern = Arrays.asList(1,4,9,16,25);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   public void testWhileQuadrat5to10() {
      System.out.println("SequenceOfNumbersTest.whileQuadrat5to10");
      List<Integer> list = testee.whileQuadrat5to10();
      List<Integer> pattern = Arrays.asList(25,36,49,64,81,100);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   public void testDoWhileQuadrat10to15() {
      System.out.println("SequenceOfNumbersTest.whileQuadrat10to15");
      List<Integer> list = testee.doWhileQuadrat10to15();
      List<Integer> pattern = Arrays.asList(100,121,144,169,196,225);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   public void testQuadratRange1to1000() {
      System.out.println("SequenceOfNumbersTest.quadratRange1to1000");
      List<Integer> list = testee.quadratRange1to1000();
      List<Integer> pattern = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   public void testKubik1to10() {
      System.out.println("SequenceOfNumbersTest.kubik1to10");
      List<Integer> list = testee.kubik1to10();
      List<Integer> pattern = Arrays.asList(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }
}