package Lista_1;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		int dobro  = num1*2;
		double tercaParte = num1 /3;
		
		JOptionPane.showMessageDialog(null, "Dobro: " + dobro + 
				                      "\nTerça parte: " + tercaParte);
	}

}
