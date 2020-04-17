import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Trezz {
	public static int HeadCount = 0;

	public static void main(String[] args) throws IOException {

		File file = new File("primes4.txt");

		Scanner infile = new Scanner(file);

		Scanner in = new Scanner(System.in);

		node head = new node();

		head.Data = infile.nextInt();
		// read 1 mill prime numbers
		int a;

		int sumDepth = 0;
		while (infile.hasNext()) {
			HeadCount = 0;
			a = infile.nextInt();
			Insert(head, a);
			sumDepth += HeadCount;
		}
		System.out.println("Creating Binary Tree from 1000000 prime numbers...");
		System.out.println("Enter a number to search(Prime Plz)\n");

		int t = in.nextInt();
		if (Locate(head, t)) {
			System.out.println("\nYour Number is Prime.\n");
		} else {

			System.out.println("\nNumber is Not Prime.\n");

			//System.out.println("The Nearest Prime Number Greater =  " + Greater);
			//System.out.println("The Nearest Prime Number Less =  " + lower);
			System.out.println("\nThe Average of the depth is " + sumDepth + "\n");
			System.out.println("The Depth of the Linked List Is " + HeadCount);
		}

	}

	static boolean Locate(node TheNode, int TheData) {
		HeadCount++;
		if (TheNode == null)
			return false;
		if (TheNode.Data == TheData)
			return true;
		else if (TheNode.Data > TheData) // traverse tree to the left
			return Locate(TheNode.Left, TheData);
		else if (TheNode.Data < TheData) // traverse tree to the right
			return Locate(TheNode.Right, TheData);
		else if (TheNode.Data > TheData && TheNode.Left == null)
			return false;
		else if (TheNode.Data < TheData && TheNode.Right == null)
			return false;
		return false; // Java needs a default return
	}

	static void Insert(node TheNode, int NewData) {
		HeadCount++;
		if (TheNode.Data > NewData && TheNode.Left == null) // Left is null -
															// add new node on
															// left
		{
			node T = new node();
			T.Data = NewData;
			TheNode.Left = T;
		} else if (TheNode.Data < NewData && TheNode.Right == null) // Right is
																	// null -
																	// add new
																	// node on
																	// right
		{
			node T = new node();
			T.Data = NewData;
			TheNode.Right = T;
		} else if (TheNode.Data > NewData && TheNode.Left != null) // Left isn't
																	// null -
																	// recurse
																	// to left
			Insert(TheNode.Left, NewData);
		else if (TheNode.Data < NewData && TheNode.Right != null) // Right isn't
																	// null -
																	// recurse
																	// to right
			Insert(TheNode.Right, NewData);
	}

}

class node {
	node Right;
	node Left;
	int Data;
}
