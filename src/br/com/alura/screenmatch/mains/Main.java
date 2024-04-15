package br.com.alura.screenmatch.mains;

import br.com.alura.screenmatch.calculations.Recommendations;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Movie myMovie = new Movie("Top Gun Maverick", 2022);
		myMovie.setDurationInMinutes(150);
		myMovie.setIncludedInSubscription(true);

		myMovie.showDatasheet();
		myMovie.rate(8);
		myMovie.rate(5);
		myMovie.rate(10);

		System.out.printf("Média de avaliação: %.2f", myMovie.ratingAverage());
		System.out.println("\nTotal de avaliações: " + myMovie.getTotalRatingVotes());

		Serie mySerie = new Serie("From", 2020);
		mySerie.showDatasheet();

		mySerie.setSeasons(10);
		mySerie.setEpisodesPerSeason(10);
		mySerie.setMinutesPerEpisode(50);
		System.out.println("Duração da temporada em minutos: " + mySerie.getDurationInMinutes());

		TimeCalculator calculator = new TimeCalculator();
		calculator.include(myMovie);
		calculator.include(myMovie);
		calculator.include(myMovie);
		calculator.include(mySerie);
		System.out.println(calculator.getTotalTime());

		Recommendations recommendation = new Recommendations();
		recommendation.filter(myMovie);

		Movie avatar = new Movie("Avatar", 2023);
		Movie superman = new Movie("Superman", 2012);


		Episode episode = new Episode();
		episode.setNumber(1);
		episode.setSerie(mySerie);
		episode.setTotalViews(100);
		recommendation.filter(episode);

		ArrayList<Movie> movieArrayList = new ArrayList<>();
		movieArrayList.add(myMovie);
		movieArrayList.add(avatar);
		movieArrayList.add(superman);

		System.out.println("\n" + movieArrayList.size());
		System.out.println(movieArrayList);


	}
}
