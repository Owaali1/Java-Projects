import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class SelectionSort {
    
	static int SecletionSortCount = 0;

	public static void main(String[] args) throws IOException {

		File file = new File("primes1.txt");

		Scanner infile = new Scanner(file);	

		ArrayList<Integer> Primes2 = new ArrayList<Integer>();
                
		int temp;

		long startTime, endTime;

		int n;

		while (infile.hasNextInt()) {

			n = infile.nextInt();

			Primes2.add(n);

		}
		// selection

		System.out.println("Primes Read : " + Primes2.size());

		startTime = System.currentTimeMillis();

		Primes2 = SelectionSort(Primes2);

		endTime = System.currentTimeMillis();

		System.out.println("Elapsed Seconds = "

				+ (double) ((endTime - startTime) / 1000.0));

		System.out.println("iterations = " + SecletionSortCount++);

		System.out.print("First 10 sorted : ");

		for (int i = 0; i < 10; i++) {

			System.out.print(Primes2.get(i) + " ");

		}

	}

	

	static ArrayList<Integer> SelectionSort(ArrayList<Integer> Primes2) {
		int temp;
		int min;

		for (int i = 0; i < Primes2.size(); i++) {
			min = i; // data[x] will start as the smallest value
			for (int j = i; j < Primes2.size(); j++) {
				SecletionSortCount++;

				if (Primes2.get(j) < Primes2.get(min)) {
					min = j;
				}
			}

			// swap data[x] with data[min]
			temp = Primes2.get(i);
			Primes2.set(i, Primes2.get(min));
			Primes2.set(min,temp);
			

		}

		return Primes2;

	}

	

}