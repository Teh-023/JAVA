package heranca;

import heranca.funcionario.Gerente;
import heranca.funcionario.Diretor;
import heranca.funcionario.Secretario;
import heranca.funcionario.Engenheiro;

public class App {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("José da Silva", "11122233344", 4000.00, 1234, 15);
		Diretor diretor = new Diretor("João Moutinho", "22233344455", 10000.00, "superSenha@s");
		Secretario secretario = new Secretario("Cristiano Ronaldo", "33344455566", 2800.00, "acesso123");
		Engenheiro engenheiro = new Engenheiro("Faraó Qeops","77788899910", 15000.00, "12345-6", "548-9");
		
		System.out.println("Salário Gerente: " + gerente.getSalario());
		System.out.println("Salário Diretor: " + diretor.getSalario());
		System.out.println("Salário Secretário: " + secretario.getSalario());
		System.out.println("Salário Engenheiro: " + engenheiro.getSalario());
	}

}
