package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		
		int controlador = 0;
		int soma = 0;
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			soma += numero;
			controlador = Integer.parseInt(JOptionPane.showInputDialog("Deseja mesmo continuar? +"
			        + "\nDigite 1 para sim"
			        + "\nDigite -1 para não"));
		}while(controlador > 0 );
	}

}
