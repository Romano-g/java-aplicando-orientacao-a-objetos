package desafio_001.models;

public class Book {
	private String title;
	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showDetails () {
		System.out.printf("""
				\nNome do autor: %s
				Título do livro: %s
				""", author, title);
	}
}
