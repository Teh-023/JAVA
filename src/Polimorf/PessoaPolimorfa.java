package Polimorf;

import java.awt.Component;

import javax.swing.JOptionPane;

public class PessoaPolimorfa {


public static void main(String[] args) {
	
	Pessoa pessoa = null;
	
	int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de 1 a 4: "));
	
	switch(opcao) {
	case 1: pessoa = new Pessoa();
	break;
	
	case 2: pessoa = new PessoaFisica();
	break;
	
	case 3: pessoa = new PessoaJuridica();
	break;
	
	case 4: pessoa = new Funcionario();
	break;
	
	default: JOptionPane.showMessageDialog((Component) (null),"Tipo desconhecido");
	System.exit(opcao = 0);
}
	pessoa.mostrarClasse();
	if(pessoa instanceof PessoaJuridica) {
		pessoa = (PessoaJuridica) pessoa;
		
		((PessoaJuridica) pessoa).getCnpj();
	}
	
	

}
}

