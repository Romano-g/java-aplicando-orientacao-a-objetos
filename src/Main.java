import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
	public static void main(String[] args) {
		Movie myMovie = new Movie();
		myMovie.setName("Top Gun Maverick");
		myMovie.setReleaseYear(2022);
		myMovie.setDurationInMinutes(150);
		myMovie.setIncludedInSubscription(true);

		myMovie.showDatasheet();
		myMovie.rate(8);
		myMovie.rate(5);
		myMovie.rate(10);

		System.out.printf("Média de avaliação: %.2f", myMovie.ratingAverage());
		System.out.println("\nTotal de avaliações: " + myMovie.getTotalRatingVotes());

		Serie mySerie = new Serie();
		mySerie.setName("From");
		mySerie.setReleaseYear(2020);
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
	}
}
