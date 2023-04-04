package Lista_1;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		
		int KM = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de KM percorrido: "));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias: "));
		  
		double total = (90 * dias) + (0.20 * KM);
		
		JOptionPane.showMessageDialog(null, "A quantidade de KM percorrido é: " + KM + "km");
		JOptionPane.showMessageDialog(null, "O valor total é: R$ " + total + " ,00");
		
	}


}
