package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		
		int numerosEntre0E100 = 0;
		
		for(int i = 0; i < 20; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
			if(numero >= 0 && numero <= 100)
				numerosEntre0E100++;
		}
		
		System.out.println("Temos: " + numerosEntre0E100 + "números entre 0 e 100");

	}

}
