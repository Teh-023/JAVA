package curso;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
		int idades[] = new int[10];
		
		//idades[0] = 58;
		//idades[1] = 20;
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade: "));
		}
		
		System.out.println("------Idades-----");
		for(int i = 0; i < idades.length; i++) {
			System.out.println("Idade:" + idades[i]);
		}


	}

}
