package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {

int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		int soma = 0;
		
		for(int i= 0; i < 20; i++) {
			soma += idade;
			
			System.out.println("A soma das idades informadas é: " + soma);
		}

	}

}
