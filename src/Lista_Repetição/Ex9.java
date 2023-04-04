package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
		int idadeMenor = 0;
		String nomeMenor = "";
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		for(int i = 0; i < 10; i++) {
			if(idadeMenor == 0 || idade < idadeMenor) {
				idadeMenor = idade;
				nomeMenor = nome;
				
			}
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "Idade: " + idade + 
					                     "\nMenor idade digitada: " + idadeMenor);
		}

	}

}
