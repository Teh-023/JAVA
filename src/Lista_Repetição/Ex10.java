package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
	
		String tabuada = "";
		int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for(int i = 1; i <= 10; i++) {
			tabuada += numeroDigitado + " X " + i + "=" + (numeroDigitado * i) + "\n";
		}
		JOptionPane.showMessageDialog(null, tabuada);
	}

}

