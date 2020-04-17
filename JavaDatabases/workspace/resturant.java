import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class resturant {
	public static ArrayList<Order> Q = new ArrayList<Order>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		
		int choice = 0;
		
		while ( choice >= 0) {
			System.out.println("=====================================");
			System.out.println("1 = Enqueue an order for a taco");
			System.out.println("2 = Enqueue an order for a burri1to");
			System.out.println("3 = Enqueue an order for a quesadilla");
			System.out.println("4 = List all items in queue");
			System.out.println("5 = Dequeue an order");
			System.out.println("6 = Exit");
			System.out.println("=====================================");
			System.out.println("Your Choice: ");
			choice = in.nextInt();
			if (choice == 1) {
				Enqueue(new Order("taco", 1.69, new Date()));
				System.out.println("TACO, Ordered");
			}
			if (choice == 2) {

				Enqueue(new Order("burrito", 1.69, new Date()));
				System.out.println("BURRITO, Ordered");

			}
			if (choice == 3) {
				Enqueue(new Order("quesadilla", 1.69, new Date()));
				System.out.println("QUESADILLA, Ordered");
			}
			if (choice == 4) {
				for (int i = 0; i < Q.size(); i++) {
					System.out.println(Q.get(i).Item + " " + df.format(Q.get(i).OrderTime));
				}

			}
			if (choice == 5) {
				if (Q.size() > 0) {
					Order T = Dequeue();
					System.out.println("Item has been removed " + " " + T.Item + " " + df.format(T.OrderTime));
				} else {
					System.out.println("Order is Empty");

				}

			}
			if (choice == 6) {
				Exit();

			}

		}
	}

	static void Exit() {
		System.exit(0);
	}

	static void Enqueue(Order Ord) {
		Q.add(0, Ord);
	}

	static Order Dequeue() {
		Order TempOrder = Q.get(Q.size() - 1);
		Q.remove(Q.size() - 1);
		return TempOrder;

	}

}

class Order {
	String Item;
	double Price;
	Date OrderTime = new Date();

	Order(String NewItem, double NewPrice, Date NewOrderTime) {
		Item = NewItem;
		Price = NewPrice;
		OrderTime = NewOrderTime;
	}

	// add a constructor with parameters for the attributes
}