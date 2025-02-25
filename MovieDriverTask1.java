package project1;

import java.util.Scanner;

public class MovieDriverTask1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Movie mv = new Movie(); /* Creating an instance of the movie class */

		System.out.println("Enter the name of a movie"); /* User input for all required inputs. */
		String name = sc.nextLine();
		mv.setTitle(name);
		System.out.println("Enter the rating of the movie");
		String rating = sc.nextLine();
		mv.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets = sc.nextInt();
		sc.nextLine();
		mv.setSoldTickets(tickets);
		System.out.println(mv.toString());
		System.out.println("Goodbye");
	}

}