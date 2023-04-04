package Lista_1;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));
		
		JOptionPane.showMessageDialog(null, "Nome do funcionário: " + nome + 
				         "\nSalário do funcionário: R$ " + salario);
		
		
	}

}
