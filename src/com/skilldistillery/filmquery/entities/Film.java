package com.skilldistillery.filmquery.entities;

public class Film {
	private int id;
	private String title;
	private String description;
	private int releaseYear;
	private int languageId;
	private String rentalDuration;
	private double rentalFee;
	private double rentalRate;
	private String length;
	private double replacementCost;
	private String rating;
	private String specitalFeatures;

	public Film(int id, String title, String description, int releaseYear, int languageId, String rentalDuration,
			double rentalFee, double rentalRate, String length, double replacementCost, String rating,
			String specitalFeatures) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalFee = rentalFee;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specitalFeatures = specitalFeatures;
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

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(String rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalFee() {
		return rentalFee;
	}

	public void setRentalFee(double rentalFee) {
		this.rentalFee = rentalFee;
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
		return "Film id: " + id + " title: " + title + "\ndescription: " + description + "\n release year: "
				+ releaseYear + ", language id " + languageId + ", rental duration: " + rentalDuration + ", rental fee: "
				+ rentalFee + ", rental rate: " + rentalRate + "\nlength:" + length + ", replacement cost:"
				+ replacementCost + ", rating: " + rating + ", specital features: " + specitalFeatures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + languageId;
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + releaseYear;
		result = prime * result + ((rentalDuration == null) ? 0 : rentalDuration.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rentalFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rentalRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(replacementCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((specitalFeatures == null) ? 0 : specitalFeatures.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (languageId != other.languageId)
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		if (rentalDuration == null) {
			if (other.rentalDuration != null)
				return false;
		} else if (!rentalDuration.equals(other.rentalDuration))
			return false;
		if (Double.doubleToLongBits(rentalFee) != Double.doubleToLongBits(other.rentalFee))
			return false;
		if (Double.doubleToLongBits(rentalRate) != Double.doubleToLongBits(other.rentalRate))
			return false;
		if (Double.doubleToLongBits(replacementCost) != Double.doubleToLongBits(other.replacementCost))
			return false;
		if (specitalFeatures == null) {
			if (other.specitalFeatures != null)
				return false;
		} else if (!specitalFeatures.equals(other.specitalFeatures))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
