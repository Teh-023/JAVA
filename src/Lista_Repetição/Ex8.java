package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
int somaQtdeMaioresIdade = 0;
		
		for(int i = 0; i < 5; i++) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
			if(idade >= 18) {
				somaQtdeMaioresIdade += idade;
				
			}
		}
		
		System.out.println("A quantidade de pessoas maiores de idade é: " + somaQtdeMaioresIdade);
		
	}

}
