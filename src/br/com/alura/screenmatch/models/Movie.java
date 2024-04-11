package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Stars;

public class Movie extends Titles implements Stars {
	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public int getStars() {
		return (int) ratingAverage() / 2;
	}

	@Override
	public String toString() {
		return getName() + " (" + getReleaseYear() + ")";
	}
}
