import java.util.Scanner;

public class EffFibb {
		public static int Recount = 0;

	public static void main(String args[]) {

		System.out.println("What Fib Number Would You Like To Cal : ");

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		long startTime = System.currentTimeMillis();

		System.out.println("Fibb number up to " + n);

		long endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = " + (double) ((endTime - startTime) / 1000.0));
		
		System.out.println("Number of Methods Called : " + Recount);

		for (int i = 1; i <= n; i++) {
			
			System.out.println(fibonacciRecusion(i) + " ");
		}

	}
	public static int fibonacciRecusion(int n) {
		Recount ++;
		if (n == 1 || n == 2) {
			return 1;
		}

		return fibonacciRecusion(n - 1) + fibonacciRecusion(n - 2); // tail
																				// recursion
	}
}
