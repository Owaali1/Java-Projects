import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.alg.*;

public class map {

	static double totalL = 0;

	public static void main(String[] args) throws IOException {

		SimpleWeightedGraph<String, DefaultWeightedEdge> g = new SimpleWeightedGraph<String, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);

		File file = new File("interstate.txt");
		Scanner infile = new Scanner(file);
		Scanner inConsole = new Scanner(System.in);
		String inputName;
		while (infile.hasNext()) {
			inputName = infile.nextLine();

			if (inputName.length() > 0 && inputName.charAt(0) == 'I') {
				String[] parts = (inputName.split(" "));
				g.addVertex(parts[1]);
				g.addVertex(parts[3]);
				g.addEdge(parts[1], parts[3]);
				double lenght = Double.parseDouble(parts[5]);
				totalL += lenght;
				g.setEdgeWeight(g.getEdge(parts[1], parts[3]), lenght);

			}
		}

		int choice = 0;

		while (choice != 5) {
			System.out.println("---------------------------------------------------");
			System.out.println("\n1 = Graph summary information");
			System.out.println("2 = Vertex summary information");
			System.out.println("3 = Show all vertices");
			System.out.println("4 = Get path between two vertices");
			System.out.println("5 = Exit");
			System.out.println("Enter your choice: \n");
			System.out.println("---------------------------------------------------");

			choice = inConsole.nextInt();
			if (choice == 1) {
				System.out.println("The Graph has " + g.vertexSet().size() + " Vertices  and  has " + g.edgeSet().size()
						+ " Edges " + "\n");
				System.out.println("The Total Distance in miles is " + totalL + "\n");

			}
			if (choice == 2) {
				System.out.println("\nEnter Vertex Name : ");
				String Vertex = inConsole.next();
				if (g.containsVertex(Vertex)) {
					System.out.println("Vertex has : " + g.edgesOf(Vertex).size() + "\n");
					System.out.println(g.edgesOf(Vertex) + "\n");
				} else {
					System.out.println("----------------------------------------------------\n");
					System.out.println("Vertex Was Not Found\n");
					System.out.println("\n---------------------------------------------------");

				}

			}
			if (choice == 3) {
				System.out.println("\n" + g.vertexSet() + "\n");
			}
			if (choice == 4) {

				System.out.println("\nEnter original Vertex Name : ");
				String start = inConsole.next();
				System.out.println("Enter End Destination Name : ");
				String end = inConsole.next();
				if (g.containsVertex(start) && g.containsVertex(end)) {
					System.out.println("Distance Between the two : " + totalL + "\n");
					System.out.println(g.vertexSet());
					System.out.println("\nShortest Path is : \n");
					DijkstraShortestPath path = new DijkstraShortestPath<>(g, start, end);
					System.out.println("Path = " + path.getPathEdgeList());
					System.out.println("Length = " + path.getPathLength());
				} else {
					System.out.println("----------------------------------------------------\n");
					System.out.println("\nVertex Was Not Found");
					System.out.println("\n---------------------------------------------------");

				}

			}

		}
	}

}
