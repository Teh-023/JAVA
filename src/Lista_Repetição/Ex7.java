package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		int somaDeIdades = 0;
		double media = 0.0;
			
			for(int i= 0; i < 20; i++) {
				somaDeIdades += idade;
				media = somaDeIdades / 20;
				
				System.out.println("A soma das idades informadas é: " + media);
		}

	}
	}
