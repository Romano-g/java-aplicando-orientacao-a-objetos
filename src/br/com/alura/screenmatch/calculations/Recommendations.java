package br.com.alura.screenmatch.calculations;

public class Recommendations {
	public void filter (Stars classifiable) {
		if (classifiable.getStars() >= 4) {
			System.out.println("Está entre os preferidos do momento.");
		} else if (classifiable.getStars() >= 2) {
			System.out.println("Bem avaliado no momento.");
		} else  {
			System.out.println("Adicione a sua lista para assistir depois.");
		}
	}
}
