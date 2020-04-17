import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Int");
		// waits input
		int n = in.nextInt();
		//displaying the method
		System.out.println("Sum of the Digits is : " + sumDigits(n));
	}
	// method for finding the sum digits.
	public static int sumDigits(int n) {
		if (n == 0)
			return 0;

		return n % 10 + sumDigits(n / 10);
	}

}
