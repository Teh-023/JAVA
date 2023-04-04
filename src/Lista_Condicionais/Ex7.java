package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String sexo = JOptionPane.showInputDialog("Digite seu sexo:");
		
		
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		
		if(sexo == "Feminino") {
			double valorDescontoF = valorCompra + valorCompra * 13/100;
			JOptionPane.showMessageDialog(null, "Valor da compra com desconto é: R$" + valorDescontoF + " ,00");
		}else {
			double valorDescontoM = valorCompra + valorCompra * 5/100;
			JOptionPane.showMessageDialog(null, "Valor da compra com desconto é: R$" + valorDescontoM + " ,00");
		}
		
	}

}
