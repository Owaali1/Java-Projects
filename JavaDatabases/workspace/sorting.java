import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class sorting {

	static long BubbleSortCount = 0;
	static long SelectionSortCount = 0;
	static long MergeSortCount = 0;

	public static void main(String[] args) throws IOException {

		System.out.print("This program compares the bubble, selection, merge sorts.\n"
				+ "The data set is 78498 unsorted integers (prime numbers less than 1,000,000)\n\n");

		File file = new File("primes1.txt");

		Scanner infile = new Scanner(file);

		ArrayList<Integer> Primes1 = new ArrayList<Integer>();
		ArrayList<Integer> Primes2 = new ArrayList<Integer>();
		ArrayList<Integer> Primes3 = new ArrayList<Integer>();
		ArrayList<Integer> Primes4 = new ArrayList<Integer>();
		

		int temp;

		long startTime, endTime;

		int n;

		while (infile.hasNextInt()) {

			n = infile.nextInt();

			Primes1.add(n);
			Primes2.add(n);
			Primes3.add(n);
			Primes4.add(n);
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

			System.out.print(Primes1.get(Primes1.size() - (i + 1)) + " ");

		}

		System.out.println();

		// Selection
		System.out.print("\nSELECTION SORT\n");

		System.out.println("\nPrimes Read : " + Primes2.size());

		startTime = System.currentTimeMillis();

		Primes2 = SelectionSort(Primes2);

		endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = "

				+ (double) ((endTime - startTime) / 1000.0));

		System.out.println("iterations = " + BubbleSortCount++);

		System.out.print("First 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes2.get(i) + " ");
		}
		System.out.println();

		System.out.print("Last 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes1.get(Primes1.size() - (i + 1)) + " ");

		}

		System.out.println("\n");

		// Merge sort output
		System.out.print("MERGE SORT SORT\n");

		System.out.println("\nPrimes Read : " + Primes3.size());

		startTime = System.currentTimeMillis();

		Primes3 = MergeSort(Primes3);

		endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = "

				+ (double) ((endTime - startTime) / 1000.0));

		System.out.println("iterations = " + BubbleSortCount++);

		System.out.print("First 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes3.get(i) + " ");
		}
		System.out.println();

		System.out.print("Last 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes1.get(Primes1.size() - (i + 1)) + " ");

		}

		System.out.println();

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

	// Selection sort Method

	static ArrayList<Integer> SelectionSort(ArrayList<Integer> Primes2) {
		int temp;
		int min;

		for (int i = 0; i < Primes2.size(); i++) {
			min = i; // data[x] will start as the smallest value
			for (int j = i; j < Primes2.size(); j++) {
				SelectionSortCount++;

				if (Primes2.get(j) < Primes2.get(min)) {
					min = j;
				}
			}

			// swap data[x] with data[min]
			temp = Primes2.get(i);
			Primes2.set(i, Primes2.get(min));
			Primes2.set(min, temp);

		}

		return Primes2;

	}

	// Merge sort beginning
	static ArrayList<Integer> MergeSort(ArrayList<Integer> dataset) {
		if (dataset.size() == 1)
			return dataset;
		else {
			// split data into 2 parts
			ArrayList<Integer> LeftData = new ArrayList<Integer>(dataset.subList(0, dataset.size() / 2));
			ArrayList<Integer> RightData = new ArrayList<Integer>(dataset.subList(dataset.size() / 2, dataset.size()));
			dataset = Merge(MergeSort(LeftData), MergeSort(RightData));
		}
		return dataset;
	}

	// merge the left and right lists together
	static ArrayList<Integer> Merge(ArrayList<Integer> LeftData, ArrayList<Integer> RightData) {
		ArrayList<Integer> MergedData = new ArrayList<Integer>();
		while (LeftData.size() > 0 || RightData.size() > 0) {
			MergeSortCount++;
			if (RightData.size() == 0) {
				MergedData.add(LeftData.get(0));
				LeftData.remove(0);
			} else if (LeftData.size() == 0) {
				MergedData.add(RightData.get(0));
				RightData.remove(0);
			} else if (LeftData.get(0) < RightData.get(0)) {
				MergedData.add(LeftData.get(0));
				LeftData.remove(0);
			} else {
				MergedData.add(RightData.get(0));
				RightData.remove(0);
			}
		}
		return MergedData;
	}
}