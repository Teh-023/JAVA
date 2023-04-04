package Lista_1;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A somatória dos números informados é: " + soma);

	}

}
