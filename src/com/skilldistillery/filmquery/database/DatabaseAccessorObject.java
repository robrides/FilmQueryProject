package com.skilldistillery.filmquery.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class DatabaseAccessorObject implements DatabaseAccessor {

	private static final String URL = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
	private static final String user = "student";
	private static final String pwd = "student";

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Film findFilmById(int filmId) {
		// connect db, write sql, get resultset, print out resulset which will be one

		String sql = "SELECT id, title, description, release_year, language_id, rental_duration, rental_rate, rental_fee, length, replacement_cost, rating, special_features FROM film WHERE id = ?";
		System.out.println(sql);
		try (Connection conn = DriverManager.getConnection(URL, user, pwd);
				PreparedStatement pst = conn.prepareStatement(sql);)

		{
			pst.setInt(1, filmId); // 1 is the count from one of the question mark comma variable
			ResultSet rs = pst.executeQuery();
			System.out.println(rs.toString());
			if (rs.next()) {
				Film film = new Film(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
						rs.getInt("release_year"), rs.getInt("language_id"), rs.getString("rental_duration"),
						rs.getDouble("rental_fee"), rs.getDouble("rental_rate"), rs.getString("length"),
						rs.getDouble("replacement_cost"), rs.getString("rating"), rs.getString("specital_features"));
				return film;
			}

		} catch (SQLException e) {
			System.err.println("The application has encountered a SQL Exception.");
			e.printStackTrace();
		}

		return null;
	}

	public Actor findActorById(int actorId) {

		return null;
	}

	public List<Actor> findActorsByFilmId(int filmId) {
		return null;
	}

}
