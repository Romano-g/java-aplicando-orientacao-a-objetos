package br.com.alura.screenmatch.models;

public class Titles implements Comparable<Titles> {
	private String name;
	private int releaseYear;
	private boolean includedInSubscription;
	private double sumOfRatings;
	private int totalRatingVotes;
	private int durationInMinutes;

	public Titles(String name, int releaseYear) {
		this.name = name;
		this.releaseYear = releaseYear;
	}

	public int getTotalRatingVotes () {
		return totalRatingVotes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public boolean isIncludedInSubscription() {
		return includedInSubscription;
	}

	public void setIncludedInSubscription(boolean includedInSubscription) {
		this.includedInSubscription = includedInSubscription;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public void showDatasheet () {
		System.out.println("\nNome do filme: " + name);
		System.out.println("Ano de lançamento: " + releaseYear);
		System.out.println("Duração em minutos: " + durationInMinutes);
	}

	public void rate (double note) {
		sumOfRatings += note;
		totalRatingVotes++;
	}

	public double ratingAverage () {
		return sumOfRatings / totalRatingVotes;
	}

	@Override
	public String toString() {
		return getName() + " (" + getReleaseYear() + ")";
	}

	@Override
	public int compareTo(Titles titles) {
		return this.getName().compareTo(titles.getName());
	}
}
