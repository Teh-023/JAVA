package curso;

import javax.swing.JOptionPane;

public class MetodoSqrt {

	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ver sua raiz quadrada: "));
		System.out.println("Raiz quadrada: " + Math.sqrt(numero));
		
		

	}

}
