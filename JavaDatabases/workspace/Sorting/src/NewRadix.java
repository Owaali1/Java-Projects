import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NewRadix {
	
	static long RadixSortCount= 0;

	public static void main(String[] args) throws IOException {
		File file = new File("primes1.txt");
		Scanner infile = new Scanner(file);

		ArrayList<Integer> Primes1 = new ArrayList<Integer>();

		int temp;

		long startTime, endTime;

		int n;

		while (infile.hasNextInt()) {

			n = infile.nextInt();

			Primes1.add(n);

		}
		// bubble
				System.out.print("Radix SORT\n");

				System.out.println("\nPrimes Read : " + Primes1.size());

				startTime = System.currentTimeMillis();

				Primes1 = RadixSort(Primes1);

				endTime = System.currentTimeMillis();

				System.out.println("Elapsed Seconds = "

						+ (double) ((endTime - startTime) / 1000.0));

				System.out.println("iterations = " + RadixSortCount++);

				System.out.print("First 10 sorted : ");

				for (int i = 0; i < 10; i++) {

					System.out.print(Primes1.get(i) + " ");
				}
				System.out.println();

				System.out.print("Last 10 sorted : ");

				for (int i = 0; i < 10; i++) {


				    System.out.print(Primes1.get(Primes1.size() - (i+1)) + " ");
				}


	}

	
	private static ArrayList<Integer> RadixSort(ArrayList<Integer> Primes1) {
		
		
		
		
		
		return Primes1;
	}


	public static void RadixSort(int[] a) {
		int i, m = a[0], exp = 1, n = a.length;
		int[] b = new int[10];
		for (i = 1; i < n; i++)
			if (a[i] > m)
				m = a[i];
		while (m / exp > 0) {
			int[] bucket = new int[10];

			for (i = 0; i < n; i++)
				bucket[(a[i] / exp) % 10]++;
			for (i = 1; i < 10; i++)
				bucket[i] += bucket[i - 1];
			for (i = n - 1; i >= 0; i--)
				b[--bucket[(a[i] / exp) % 10]] = a[i];
			for (i = 0; i < n; i++)
				a[i] = b[i];
			exp *= 10;
		}
	}
}
