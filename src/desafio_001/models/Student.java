package desafio_001.models;

public class Student {
	private String name;
	private double grades;
	private int gradesNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades += grades;
		gradesNumbers++;
	}

	public double calculateMedia () {
		return grades / gradesNumbers;
	}
}
