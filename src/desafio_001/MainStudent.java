package desafio_001;

import desafio_001.models.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student tutu = new Student();

		tutu.setName("Arthur");
		tutu.setGrades(10);
		tutu.setGrades(5);
		tutu.setGrades(7.5);
		tutu.setGrades(9);
		tutu.setGrades(6.5);

		System.out.println("Nome: " + tutu.getName() + " media final: " + tutu.calculateMedia());
	}
}
