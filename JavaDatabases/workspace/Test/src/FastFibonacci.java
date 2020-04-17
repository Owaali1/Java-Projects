import java.math.*;
import java.io.*;

public class FastFibonacci {

	private static BigInteger[] answers;

	private static BigInteger one;
	private static BigInteger zero;

	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static BigInteger fastFibonacci(int n) {

		if ((n == 1) || (n == 2))
			return answers[0];

		if (answers[n - 1].compareTo(zero) != 0)
			return answers[n - 1];

		if (answers[n - 2].compareTo(zero) == 0)
			answers[n - 2] = fastFibonacci(n - 1);

		if (answers[n - 3].compareTo(zero) == 0)
			answers[n - 3] = fastFibonacci(n - 2);

		return answers[n - 2].add(answers[n - 3]);
	}

	public static void main(String[] args) {

		int n;
		long time, newTime;
		BigInteger answer;

		System.out.println("Type a positive integer.");
		try {

			String input = stdin.readLine();

			n = Integer.parseInt(input);

			zero = new BigInteger("0");
			one = new BigInteger("1");

			answers = new BigInteger[n];
			answers[0] = new BigInteger("1");
			answers[1] = new BigInteger("1");
			for (int i = 2; i < n; i++)
				answers[i] = new BigInteger("0");

			time = System.currentTimeMillis();
			answer = fastFibonacci(n);
			newTime = System.currentTimeMillis();

			System.out.println("The " + n + "th Fibonacci number is " + answer);
			System.out.println("It took " + (newTime - time) + " milliseconds to compute it.");

		} catch (java.io.IOException e) {
			System.out.println(e);
		}

	}

}
