package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (num%2 == 0) {
			JOptionPane.showMessageDialog(null, "O número digitado é PAR");
		}else {
			JOptionPane.showMessageDialog(null, "O número digitado é ÍMPAR");
		}
	}

}
