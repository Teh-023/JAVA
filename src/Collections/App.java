package Collections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
	Aluno aluno1 = new Aluno("José da Silva", "Química", 10);
	Aluno aluno2 = new Aluno("João da Silva", "Física", 9);
	Aluno aluno3 = new Aluno("Maria da Silva", "Matemática", 12);
	Aluno aluno4 = new Aluno("Marta Moraes", "História", 13);
	
	
	System.out.println("Aluno: " + alunos.get(0));
	
	System.out.println(alunos);
	
	alunos.remove(1);
	
	System.out.println(alunos);
	}

}
