
import java.io.IOException;
import java.util.Scanner;

public class fibonacci {
	static int Recount = 0;

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		System.out.println("What Fib Number Would You Like To Cal : ");
		int n = in.nextInt();
		long startTime = System.currentTimeMillis();

		System.out.println(" Fibn Number is " +fibn(n));

		long endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = " + (double) ((endTime - startTime) / 1000.0));
		System.out.println("Number of Methods Called : " + Recount);
	}
	


	public static int fibn(int n) {
		Recount++;
		if (n <= 1)
			return n;
		else
			return fibn(n - 1) + fibn(n - 2);

	}
	

}