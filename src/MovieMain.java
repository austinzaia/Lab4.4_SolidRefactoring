import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MovieMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		MovieList.addMovies();
		ArrayList<Movie> movies = MovieList.getMovies();

		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Please Select a Movie from the list: ");

		for (int i = 0; i < movies.size(); i++) {
			System.out.print((i + 1) + ") ");
			System.out.println(movies.get(i).getTitle());
		}

		int selection = selectMovie(movies, scanner);

		System.out.println("Are you sure you want to watch " + (movies.get(selection - 1).getTitle() + "? (yes/no): "));
		String answer = scanner.nextLine();

		if (answer.equalsIgnoreCase("yes")) {
			selectScene(movies, scanner, selection);
		}

	}

	public static int selectMovie(ArrayList<Movie> movies, Scanner scanner) {
		boolean cont = true;
		int selection = 0;
		System.out.println("Please select a movie you want to watch: ");
		do {
			try {
				selection = scanner.nextInt();
				if (selection <= movies.size() && selection > 0) {
					cont = false;
				} else {
					System.out.println("Please enter a valid number.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please try again, enter a valid number.");
				scanner.next();
			}

		} while (cont);

		scanner.nextLine();
		movies.get(selection - 1).printInfo();
		return selection;
	}

	public static void selectScene(ArrayList<Movie> movies, Scanner scanner, int selection) {
		System.out.println("Select the scene you would like to watch: ");
		for (int i = 0; i < movies.get(selection - 1).scenes.size(); i++) {
			System.out.print("Scene " + (i + 1) + ") ");
			System.out.println(movies.get(selection - 1).scenes.get(i));
		}
		int selection2 = scanner.nextInt();
		scanner.nextLine();
		System.out
		.println("Playing scene #" + selection2 + ", " + movies.get(selection - 1).scenes.get(selection2 - 1));
	}
}