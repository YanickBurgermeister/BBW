package ch.bbw.pr.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ForLoopsTest {
   private ForLoops testee;

   @Before
   public void setUp() throws Exception {
      testee = new ForLoops();
   }

   @After
   public void tearDown() throws Exception {
      testee = null;
   }

   private List<Integer> generate(int a, int b, int c) {
      int lim = a<c?(c-a)/Math.abs(b)+1:(a-c)/Math.abs(b)+1;
      return Stream.iterate(a, n -> n + b).limit(lim).collect(Collectors.toList());
   }

   @Test
   public void for1to50() {
      System.out.println("ForLoopsTest.for1to50");
      List<Integer> list = testee.for1to50();
      List<Integer> pattern = generate(1, 1, 50);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for0to30() {
      System.out.println("ForLoopsTest.for0to30");
      List<Integer> list = testee.for0to30();
      List<Integer> pattern = generate(0, 1, 30);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for50to100() {
      System.out.println("ForLoopsTest.for50to100");
      List<Integer> list = testee.for50to100();
      List<Integer> pattern = generate(50, 1, 100);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for40to0() {
      System.out.println("ForLoopsTest.for40to0");
      List<Integer> list = testee.for40to0();
      List<Integer> pattern = generate(40, -1, 0);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for200to180() {
      System.out.println("ForLoopsTest.for200to180");
      List<Integer> list = testee.for200to180();
      List<Integer> pattern = generate(200, -1, 180);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for2er2to20() {
      System.out.println("ForLoopsTest.for2er2to20");
      List<Integer> list = testee.for2er2to20();
      List<Integer> pattern = generate(2, 2, 20);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for7er7to70() {
      System.out.println("ForLoopsTest.for7er7to70");
      List<Integer> list = testee.for7er7to70();
      List<Integer> pattern = generate(7, 7, 70);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for12er60to120() {
      System.out.println("ForLoopsTest.for12er60to120");
      List<Integer> list = testee.for12er60to120();
      List<Integer> pattern = generate(60, 12, 120);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for5er125to0() {
      System.out.println("ForLoopsTest.for5er125to0");
      List<Integer> list = testee.for5er125to0();
      List<Integer> pattern = generate(125, -5, 0);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for25er600to200() {
      System.out.println("ForLoopsTest.for25er600to200");
      List<Integer> list = testee.for25er600to200();
      List<Integer> pattern = generate(600, -25, 200);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }

   @Test
   public void for13er2197to2028() {
      System.out.println("ForLoopsTest.for13er2197to2028");
      List<Integer> list = testee.for13er2197to2028();
      List<Integer> pattern = generate(2197, -13, 2028);

      System.out.println("soll:"+ pattern);
      System.out.println("ist:"+ list);
      assertTrue(pattern.size() == list.size());
      assertTrue(pattern.equals(list));
   }
}