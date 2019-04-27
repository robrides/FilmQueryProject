package com.skilldistillery.filmquery.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();
//		app.test();
		app.launch();
	}

	private void test() {
		Film film = db.findFilmById(1);
		System.out.println(film); // use toString of film
	}

	private void launch() {
		Scanner input = new Scanner(System.in);
		startUserInterface(input);
		input.close();
	}

	private void startUserInterface(Scanner input) {
		System.out.print("Welcom to the Film Query App\n");
		int choice = 0;
		DOLOOP: do {
			int filmId = 0;
			String searchTerm = "";
			System.out.println("\n\nPlease chose from the following menu: ");
			System.out.println("1) Look up a film by its id. ");
			System.out.println("2) Look up a film by a search keyword.");
			System.out.println("3) Exit the application.");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.print("\nEnter a film ID >> ");
				// Handles non-numeric input
				try {
					filmId = input.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid input, please try again.");
					filmId = input.nextInt();
				}

				// Handles values zero or less
				while (filmId <= 0) {
					System.out.println("Please enter a non-negative number.");
					System.out.print("\nEnter a film ID >> ");
					filmId = input.nextInt();
				}
				System.out.println(db.findFilmById(filmId) + "\n\n");
				break;
			case 2:
				System.out.print("\nEnter a search term >> ");
				searchTerm = input.next();
				ArrayList<Integer> filmsFound = new ArrayList<Integer>();
				filmsFound = db.searchFilm(searchTerm, db);
				if (filmsFound.size() == 0) {
					System.out.println("No films found.\n");
				} else {
					for (Integer filmIdFound : filmsFound) {
						System.out.println(db.findFilmById(filmIdFound));
					}
				}
				input.nextLine();
				break;
			case 3:
				break DOLOOP;
			}

		} while (true);
	}

}
