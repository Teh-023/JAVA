package Lista_1;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salário:"));
		
		int mes = dias * 4 + 2;
		int horasTrabalhadas = 8 * mes;
		double salario = horasTrabalhadas * 25;
		
		JOptionPane.showMessageDialog(null, "A quantidade de dias trabalhados em um mês é: " + mes);
		JOptionPane.showMessageDialog(null, "O valor por horas trabalhadas é: R$ " + horasTrabalhadas + " ,00");
		JOptionPane.showMessageDialog(null, " O salário total em um mês trabalhado é: R$ " + salario + " ,00");
	}

}
