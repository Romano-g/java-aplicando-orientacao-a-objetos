package br.com.alura.screenmatch.desafio_001;

import br.com.alura.screenmatch.desafio_001.models.People;

import java.util.ArrayList;

public class PeopleMain {
	public static void main(String[] args) {
		ArrayList<People> peopleArrayList = new ArrayList<>();

		var caio = new People();
		caio.setName("Caio");
		caio.setAge(23);

		var vickvi = new People();
		vickvi.setName("Vitória");
		vickvi.setAge(24);

		var tutu = new People();
		tutu.setName("Arthur");
		tutu.setAge(1);

		peopleArrayList.add(caio);
		peopleArrayList.add(vickvi);
		peopleArrayList.add(tutu);

		System.out.println(peopleArrayList.size());
		System.out.println("Primeira pessoa: " + peopleArrayList.get(0));
		System.out.println("\n" + peopleArrayList);
	}
}
