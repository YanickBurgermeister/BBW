package ch.bbw.pr.loops;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhileLoopsTest extends TestCase {
   private WhileLoops testee;

   @Before
   public void setUp() throws Exception {
      testee = new WhileLoops();
   }

   List<Integer> generate(int a, int b, int c) {
      int lim = a<c?(c-a)/Math.abs(b)+1:(a-c)/Math.abs(b)+1;
      return Stream.iterate(a, n -> n + b).limit(lim).collect(Collectors.toList());
   }

   @Test
   public void testWhile0to20() {
      System.out.println("WhileLoopsTest.testDoWhile0to20");
      List<Integer> list = testee.while0to20();
      List<Integer> pattern = generate(0, 1, 20);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile25to50() {
      System.out.println("WhileLoopsTest.testWhile25to50");
      List<Integer> list = testee.while25to50();
      List<Integer> pattern = generate(25, 1, 50);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhileM25to25() {
      System.out.println("WhileLoopsTest.testWhileM25to25");
      List<Integer> list = testee.whileM25to25();
      List<Integer> pattern = generate(-25, 1, 25);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile4er4to40() {
      System.out.println("WhileLoopsTest.testWhile4er4to40");
      List<Integer> list = testee.while4er4to40();
      List<Integer> pattern = generate(4, 4, 40);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile9er9to81() {
      System.out.println("WhileLoopsTest.testWhile9er9to81");
      List<Integer> list = testee.while9er9to81();
      List<Integer> pattern = generate(9, 9, 81);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile11er44to121() {
      System.out.println("WhileLoopsTest.testWhile11er44to121");
      List<Integer> list = testee.while11er44to121();
      List<Integer> pattern = generate(44, 11, 121);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile8er96to16() {
      System.out.println("WhileLoopsTest.testWhile8er96to16");
      List<Integer> list = testee.while8er96to16();
      List<Integer> pattern = generate(96, -8, 16);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile25er400to100() {
      System.out.println("WhileLoopsTest.testWhile25er400to100");
      List<Integer> list = testee.while25er400to100();
      List<Integer> pattern = generate(400, -25, 100);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }

   @Test
   public void testWhile13er2197to2028() {
      System.out.println("WhileLoopsTest.testWhile13er2197to2028");
      List<Integer> list = testee.while13er2197to2028();
      List<Integer> pattern = generate(2197, -13, 2028);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(list.size() == pattern.size());
      assertTrue(list.equals(pattern));
   }
}