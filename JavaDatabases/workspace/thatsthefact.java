import java.util.*;

public class thatsthefact
{
   static int methodCount=0; // define global variable to count method calls

   public static void main (String[] args)
   {
      long startTime = System.nanoTime();
      System.out.println("20! = " + Factorial(20));

      long endTime = System.nanoTime();
      System.out.println("Elapsed Seconds = " + (double)((endTime - startTime)/1000000000.0));
      System.out.println("Method calls = " + methodCount);
   }

   public static long Factorial (int x)
   {
      methodCount++;
      if (x == 1)
         return 1;   // Terminate the recursion when x gets to 1
      else
         return x * Factorial(x - 1);
   }
}