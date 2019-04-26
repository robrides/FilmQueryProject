package com.skilldistillery.filmquery.app;

import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();
		app.test();
//    app.launch();
	}

	private void test() {
		Film film = db.findFilmById(1);
		System.out.println(film); // use toString of film
	}

	private void launch() {
		Scanner input = new Scanner(System.in);
		startUserInterface(input);
		// use a loop so the user can continue until they are done

		input.close();
	}

	private void startUserInterface(Scanner input) {
		// menu goes here
		System.out.print("Please enter a film id: ");
	}

}
