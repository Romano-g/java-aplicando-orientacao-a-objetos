package br.com.alura.screenmatch.mains;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListsMain {
	public static void main(String[] args) {
		Movie myMovie = new Movie("Top Gun Maverick", 2022);
		myMovie.rate(6);
		Movie myMovie1 = new Movie("Avatar", 2023);
		myMovie1.rate(9.5);
		Movie myMovie2 = new Movie("Superman", 2012);
		myMovie2.rate(8.2);

		Serie mySerie = new Serie("From", 2020);
		mySerie.rate(10);

		List<Titles> watchedList = new ArrayList<>();

		watchedList.add(myMovie);
		watchedList.add(myMovie1);
		watchedList.add(myMovie2);
		watchedList.add(mySerie);

		Collections.sort(watchedList);

		System.out.println();
		for (Titles i : watchedList) {
			System.out.println(i);

			if (i instanceof Movie movie && movie.getStars() > 2) {
				System.out.println("Classificação: " + movie.getStars());
			}
		}

//		watchedList.forEach(System.out::println);

		List<String> search = new ArrayList<>();

		search.add("Tom Maguire");
		search.add("Adam Sandler");
		search.add("McGiver");

		Collections.sort(search);

		System.out.println("\n" + search);
		System.out.println(watchedList);
		watchedList.sort(Comparator.comparing(Titles::getReleaseYear));
		System.out.println("\n" + watchedList);
	}
}
