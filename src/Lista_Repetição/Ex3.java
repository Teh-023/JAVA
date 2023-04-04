package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira seu nome");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Nome digitado: " + nome);
		}
	}

}
