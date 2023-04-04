package Lista_1;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
double reais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você tem em reais R$:"));
		
double dolar = reais / 3.45;
		JOptionPane.showMessageDialog(null, "Você pode comprar US$: " + dolar);
	}

}
