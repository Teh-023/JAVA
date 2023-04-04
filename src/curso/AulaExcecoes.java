package curso;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AulaExcecoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double resultado = 0.00;
		
		try {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			Double.parseDouble(null);
			resultado = valor1 / valor2;
		}catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro! Você não digitou um número válido.");
		}finally {
			scan.close();
		}
		
		System.out.println("Resultado: " + resultado);

	}

}
