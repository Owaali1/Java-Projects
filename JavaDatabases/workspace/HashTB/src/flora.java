import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class flora {

	public static void main(String[] args) throws IOException {
		File file = new File("flora.csv");
		Scanner infile = new Scanner(file);
		Scanner in = new Scanner(System.in);

		Hashtable<String, String> myHTable = new Hashtable<String, String>();
		String input;
		while (infile.hasNext()) {

			input = infile.nextLine();
			String[] parts = (input.split(","));
			myHTable.put(parts[0], parts[1]);

		}
		System.out.println("-----------------------------------------------");
		System.out.println(myHTable.size() + " Flora have been read !!! \n");
		System.out.println("-----------------------------------------------\n");

		int choice = 0;
		while (choice != 4) {

			System.out.println("1 = Search for a flora");
			System.out.println("2 = Add a new flora");
			System.out.println("3 = Delete a flora");
			System.out.println("Your choice: ");
			choice = in.nextInt();
			if (choice == 1) {
				System.out.print("Search for a Flora : ");
				String Name = in.next();
				System.out.println(Name);

				if (myHTable.get(Name) != null) {
					System.out.println(Name + " Was Found");
				} else {
					System.out.println("input was not found");

				}
				System.out.println("Family Name is : " + myHTable.get(Name));

			}
			if (choice == 2) {
				System.out.print("Add New Plant Name ");
				String add = in.next();
				System.out.print("Add Family Name ");
				String addFamily = in.next();
				myHTable.put(add, addFamily);

			}
		
			if (choice == 3) {
				System.out.print("remove a Plant : ");
				String nameRemoval = in.next();
				myHTable.remove(nameRemoval);
				System.out.println(nameRemoval + " was removed \n");
			}

		}

	}

}
