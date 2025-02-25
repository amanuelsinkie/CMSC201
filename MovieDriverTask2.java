package project1;

import java.util.Scanner;

public class MovieDriverTask2 {
	public static Scanner sc = new Scanner(System.in);

	public static void method1() {
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
	}


/* Loop to keep prompting user if more movies are to be inputted. */
public static void main(String[] args) {
    while (true) {
        MovieDriverTask2.method1();
        System.out.println("Do you want to enter another? (Yes or No)");
        String imp1 = sc.nextLine();
        String imp = imp1.toLowerCase();
        if (imp.equals("yes")) {
            continue;
        }
        else if (imp.equals("no")) {
            System.out.println("Goodbye");
            break;
    }
        else{
            System.out.println("Do you want to enter another? (Yes or No)");
            imp = sc.nextLine();
            continue;
        }
}
}
}