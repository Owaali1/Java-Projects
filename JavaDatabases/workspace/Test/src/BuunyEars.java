import java.util.*;

public class BuunyEars {

	public static void main(String[] args) {
		System.out.print("Enter Bunny Count : "  );
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("How many bunnies are in the line ? " + n);
		System.out.println("Total Number of bunny ears : " + bunnyEars(n));
		

	}
	public static int bunnyEars(int n)
	{
		if(n == 0)
			return 1;
		else
		return 2+bunnyEars(n-1);
	}
	

}
