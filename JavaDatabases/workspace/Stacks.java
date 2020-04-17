import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Stacks {

	static ArrayList<Character> Stack = new ArrayList<Character>();

	public static void main(String arg[]) {
		System.out.println(
				"This program checks if the parentheses, brackets, and braces are balanced.Please enter a string:");

		// ask user for input
		Scanner in = new Scanner(System.in);

		String Input = in.nextLine();

		System.out.println("--------------------");

		System.out.println(Input);

		boolean Balanced = true;

		for (int i = 0; i < Input.length(); i++) {

			if (Input.charAt(i) == '(' || Input.charAt(i) == '[' || Input.charAt(i) == '{') {

				Push(Input.charAt(i));
			}

			else if ((Input.charAt(i) == ')' || Input.charAt(i) == ']' || Input.charAt(i) == '}') && Stack.isEmpty())
				Balanced = false;
			else if (Input.charAt(i) == ')') {		
				if (pop(Input.charAt(i)) != '(')
				Balanced = false;
			}			
			else if (Input.charAt(i) == ']') {
				if (pop(Input.charAt(i)) != '[')
				Balanced = false;
			}			

			else if (Input.charAt(i) == '}') {
				if (pop(Input.charAt(i)) != '{')					
				Balanced = false;
			}
		}
		if (!Stack.isEmpty()) {
			Balanced = false;
		}
		if (Balanced) {
			System.out.println("Input is Balanced");

		}
		if (!Balanced) {
			System.out.println("Input is Not Balanced");
		}
	}

	/**
	 * Push("Watermelon"); Push("cant"); Push("apple"); Push("orange");
	 * 
	 * System.out.println(pop()); System.out.println(pop());
	 **/

	static void Push(Character s) {
		Stack.add(0, s);

	}

	static Character pop(char c) {
		Character s = Stack.get(0);
		Stack.remove(0);
		return s;

	}
}
