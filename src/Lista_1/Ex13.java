package Lista_1;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		
		double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual: "));
		double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do aumento que teve: "));
		
		double aumento = salarioAtual * porcentagem /100;
		double salarioAumento = salarioAtual + aumento;
		
		JOptionPane.showMessageDialog(null, "O valor do salário atual é:R$ " + salarioAtual + ",00");
		JOptionPane.showMessageDialog(null, "O valor do salário com aumento é:R$ " + salarioAumento + " ,00");

	}

}
