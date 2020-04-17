import java.util.Scanner;

public class recursive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		// waits input
		String s = in.next();
		// displaying the method
		System.out.println("String in Rev Is : " + RevString(s));

	}

	public static String RevString(String s) {
		if (s.length() == 0)
			return "";

		return s.substring(s.length() - 1) + RevString(s.substring(0, s.length() - 1));

	}

}
