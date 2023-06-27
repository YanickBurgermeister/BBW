package ch.bbw.pr.loops;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoWhileLoopsTest extends TestCase {
   private DoWhileLoops testee;

   @Before
   public void setUp() throws Exception {
      testee = new DoWhileLoops();
   }

   List<Integer> generate(int a, int b, int c) {
      int lim = a<c?(c-a)/Math.abs(b)+1:(a-c)/Math.abs(b)+1;
      return Stream.iterate(a, n -> n + b).limit(lim).collect(Collectors.toList());
   }

   @Test
   public void testDoWhile0to20() {
      System.out.println("DoWhileLoopsTest.testDoWhile0to20");
      List<Integer> list = testee.doWhile0to20();
      List<Integer> pattern = generate(0, 1, 20);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile25to50() {
      System.out.println("DoWhileLoopsTest.testDoWhile25to50");
      List<Integer> list = testee.doWhile25to50();
      List<Integer> pattern = generate(25, 1, 50);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhileM25to25() {
      System.out.println("DoWhileLoopsTest.testDoWhileM25to25");
      List<Integer> list = testee.doWhileM25to25();
      List<Integer> pattern = generate(-25, 1, 25);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile4er4to40() {
      System.out.println("DoWhileLoopsTest.testDoWhile4er4to40");
      List<Integer> list = testee.doWhile4er4to40();
      List<Integer> pattern = generate(4, 4, 40);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile9er9to81() {
      System.out.println("DoWhileLoopsTest.testDoWhile9er9to81");
      List<Integer> list = testee.doWhile9er9to81();
      List<Integer> pattern = generate(9, 9, 81);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile11er44to121() {
      System.out.println("DoWhileLoopsTest.testDoWhile11er44to121");
      List<Integer> list = testee.doWhile11er44to121();
      List<Integer> pattern = generate(44, 11, 121);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile8er96to16() {
      System.out.println("DoWhileLoopsTest.testDoWhile8er96to16");
      List<Integer> list = testee.doWhile8er96to16();
      List<Integer> pattern = generate(96, -8, 16);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile25er400to100() {
      System.out.println("DoWhileLoopsTest.testDoWhile25er400to100");
      List<Integer> list = testee.doWhile25er400to100();
      List<Integer> pattern = generate(400, -25, 100);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testDoWhile13er2197to2028() {
      System.out.println("DoWhileLoopsTest.testDoWhile13er2197to2028");
      List<Integer> list = testee.doWhile13er2197to2028();
      List<Integer> pattern = generate(2197, -13, 2028);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }
}