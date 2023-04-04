package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		
		int numerosPares = 0;
		
		for(int i = 0; i < 20; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			if(numero%2 == 0)
				numerosPares++;
				
		}
System.out.println("Temos: " + numerosPares + "números pares.");
	}

}
