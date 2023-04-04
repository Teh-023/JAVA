package Lista_1;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		
double KM = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		
		double metros = KM * 1000;
		double centimetros = KM * 10000;
		double milimetros = KM * 100000;
		
	JOptionPane.showMessageDialog(null, "Distância: " + metros + "Ms");
	JOptionPane.showMessageDialog(null, "Distância: " + centimetros + "cm");
	JOptionPane.showMessageDialog(null, "Distância: " + milimetros + "mm");

	}

}
