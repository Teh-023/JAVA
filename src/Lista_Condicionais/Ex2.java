package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		
		final int ANO_ATUAL = 2023;
		int idade = ANO_ATUAL - anoNascimento;
		
		if(anoNascimento < 70 && idade >= 16) {
			JOptionPane.showMessageDialog(null, " Sua idade é: " + idade + "Você pode votar!");
		}else 
			JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + "Você não pode votar!");

	}

}
