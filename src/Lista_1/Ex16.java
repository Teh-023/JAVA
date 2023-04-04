package Lista_1;

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		
int cigarroDia = Integer.parseInt(JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?: "));
int anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você já fumou?: "));
		
		int horas = 24;
		int perder = horas - 10;
		int vida = perder - 10;
		
		JOptionPane.showMessageDialog(null, "Você perderá: " + vida + "dias");

	}

}
