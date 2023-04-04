package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		int soma = 0;
		
		for(int i= 0; i < 10; i++) {
			soma += numero;
			
			System.out.println("A soma dos números é: " + soma);
		}

	}

}
