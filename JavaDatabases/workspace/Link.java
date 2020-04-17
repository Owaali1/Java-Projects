import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Link {

	public static void main(String[] args) throws IOException {

		File file = new File("primes4.txt");

		Scanner infile = new Scanner(file);

		Scanner in = new Scanner(System.in);

		node head = new node();

		head.data = infile.nextInt(); // change to equal first item in file.

		// read 1 mill prime numbers

		int a;

		while (infile.hasNext()) {

			a = infile.nextInt();
			node t = new node();
			t.data = a;
			t.next = head;
			head = t;

		}
		int choice = 0;
		while (choice != 4) {
			System.out.println("1 = Search for a Number  (let the user enter a number to search for)");
			System.out
					.println("2 = Add a new Number  (let the user enter a number and add it to the head of the list)");
			System.out.println("3 = Delete a Number  (let the user enter a number and delete it if found)");
			System.out.println("4 = Exit");
			choice = in.nextInt();
			if (choice == 1) {
				System.out.print("Enter number which is prime : ");
				int num = in.nextInt();
				node t = head;
				while (t.next != null && t.data != num) {
					t = t.next;
				}
				if (t.data == num) {
					System.out.println("----------------");
					System.out.println("\nNumber Found\n");
					System.out.println("----------------");
				} else {
					System.out.println("-------------");
					System.out.println("\nNot Found\n");
					System.out.println("-------------");
				}

			}
			if (choice == 2) {
				System.out.print("Enter number which is prime : ");
				int num = in.nextInt();
				node t = new node();
				t.data = num;
				t.next = head;
				head = t;
				if (t.data == num) {
					System.out.println("------------------");
					System.out.println("\nNumber Added\n");
					System.out.println("------------------");
					/**
					 * Not needed. } else { System.out
					 * .println("----------------------------------------");
					 * System .out.println("\nNot Found Therefore Cant Be
					 * Added\n");// not needed becaause any number can be added
					 * System.out
					 * .println("----------------------------------------");
					 **/
				}
			}

			if (choice == 3) {
				System.out.print("Enter number which can be deleted : ");
				int num = in.nextInt();
				node Prev = head;
				node t = head;
				while (t.next != null && t.data != num) {
					Prev = t;
					t = t.next;
				}
				if (t.data == num) {
					System.out.println("------------------");
					System.out.println("\nNumber Deleted\n");
					System.out.println("------------------");
					Prev.next = t.next;
				} else {
					System.out.println("----------------------------------------");
					System.out.println("\nNot Found Therefore Cant Be Deleted\n");
					System.out.println("----------------------------------------");
				}
			}

			if (choice == 4) {
				Exit();
			}

		}

	}

	static void Exit() {
		System.exit(0);
	}
}

class node {
	int data;
	node next;

	node() {
		next = null;

	}
}