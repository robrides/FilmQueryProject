package com.skilldistillery.filmquery.entities;

import java.util.List;

public class Film {
	private int id;
	private String title;
	private String description;
	private int releaseYear;
	private String language;
	private String rentalDuration;
	private double rentalRate;
	private String length;
	private double replacementCost;
	private String rating;
	private String specitalFeatures;
	private List<Actor> cast;
	private List<Category> categories;

	public Film(int id, String title, String description, int releaseYear, String language, String rentalDuration,
			double rentalRate, String length, double replacementCost, String rating, String specitalFeatures,
			List<Actor> cast, List<Category> categories) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.language = language;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specitalFeatures = specitalFeatures;
		this.cast = cast;
		this.categories = categories;
	}

	
	
	public List<Category> getCategories() {
		return categories;
	}



	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}



	public List<Actor> getCast() {
		return cast;
	}

	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(String rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecitalFeatures() {
		return specitalFeatures;
	}

	public void setSpecitalFeatures(String specitalFeatures) {
		this.specitalFeatures = specitalFeatures;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-----------------------------------------------------------------------------\n");
		sb.append("\nFilm id: " + id + ", Title: " + title);
		sb.append("\nDescription: " + description);
		sb.append("\nReleased: " + releaseYear + ", Language: " + language);
		sb.append("\nRental Duration in Days: " + rentalDuration + ", Rental Rate: " + rentalRate);
		sb.append("\nLength min: " + length + ", Replacement Cost: $" + replacementCost);
		sb.append("\nRating: " + rating + ", Special Features: " + specitalFeatures + "\n");
		sb.append("Cast: ");
		for (int i = 0; i < cast.size(); i++) {
			sb.append(cast.get(i));
			if (i != cast.size() - 1) {
				sb.append(", ");
			}
			if (i > 0 & i % 3 == 0) {
				sb.append("\n");
			}
		}
		for (int i = 0; i < categories.size(); i++) {
			sb.append(categories.get(i));
			if (i != categories.size() - 1) {
				sb.append(", ");
			}
			if (i > 0 & i % 3 == 0) {
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}

}
