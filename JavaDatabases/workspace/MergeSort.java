import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class MergeSort {

	static long MergeSortCount = 0;

	public static void main(String[] args) throws IOException {

		File file = new File("primes1.txt");

		Scanner infile = new Scanner(file);

		ArrayList<Integer> Primes3 = new ArrayList<Integer>();

		int temp;

		long startTime, endTime;

		int n;

		while (infile.hasNextInt()) {

			n = infile.nextInt();

			Primes3.add(n);

		}
		// Merge output

		System.out.println("Primes Read : " + Primes3.size());

		startTime = System.currentTimeMillis();

		Primes3 = MergeSort(Primes3);

		endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = "

				+ (double) ((endTime - startTime) / 1000.0));

		System.out.println("iterations = " + MergeSortCount++);

		System.out.print("First 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes3.get(i) + " ");

		}

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