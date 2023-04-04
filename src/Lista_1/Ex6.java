package Lista_1;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		int ant  = num1 -1;
		int suc = num1 + 1;
		
		JOptionPane.showMessageDialog(null, "Antecessor: " + ant + 
				                      "\nSucessor: " + suc);

	}

}
