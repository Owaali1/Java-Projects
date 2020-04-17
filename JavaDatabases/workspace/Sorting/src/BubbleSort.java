import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class BubbleSort {

	static long BubbleSortCount = 0;

	public static void main(String[] args) throws IOException {

		System.out.print("This program compares the bubble, selection, merge sorts.\n"
				+ "The data set is 78498 unsorted integers (prime numbers less than 1,000,000)\n\n");

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
		System.out.print("BUBBLE SORT\n");

		System.out.println("\nPrimes Read : " + Primes1.size());

		startTime = System.currentTimeMillis();

		Primes1 = Bubble(Primes1);

		endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = "

				+ (double) ((endTime - startTime) / 1000.0));

		System.out.println("iterations = " + BubbleSortCount++);

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

	// Bubble sort Method

	public static ArrayList<Integer> Bubble(ArrayList<Integer> Primes1) {

		int temp;

		for (int i = 0; i < Primes1.size() - 1; i++) {

			for (int j = 0; j < Primes1.size() - 1; j++) {
				BubbleSortCount++;

				if (Primes1.get(j) > Primes1.get(j + 1)) {

					temp = Primes1.get(j);

					Primes1.set(j, Primes1.get(j + 1));

					Primes1.set(j + 1, temp);

				}

			}

		}

		return Primes1;

	}

}