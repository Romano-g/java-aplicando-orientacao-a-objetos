package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Stars;

public class Movie extends Titles implements Stars {
	private String director;

	public Movie(String name, int releaseYear) {
		super(name, releaseYear);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public double getStars() {
		return ratingAverage() / 2;
	}
}
