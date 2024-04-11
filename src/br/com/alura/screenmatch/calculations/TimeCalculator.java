package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Titles;

public class TimeCalculator {
	private int totalTime;

	public int getTotalTime() {
		return totalTime;
	}

	public void include(Titles titles) {
		totalTime += titles.getDurationInMinutes();
	}
}
