package desafio_001;

import desafio_001.models.Book;

public class BookMain {
	public static void main(String[] args) {
		Book pequenoPrincipe = new Book();

		pequenoPrincipe.setTitle("O Pequeno Príncipe");
		pequenoPrincipe.setAuthor("Antoine de Saint-Exupéry");

		pequenoPrincipe.showDetails();
	}
}
