package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		
int numerosEntre0E100 = 0;
int numerosEntre101E200 = 0;
int numerosMaioresQue200 = 0;
		
		for(int i = 0; i < 20; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
			if(numero >= 0 && numero <= 100)
				numerosEntre0E100++;
			if(numero > 100 && numero <= 200)
				numerosEntre101E200++;
			else numerosMaioresQue200++;
		}
		
		System.out.println("Temos: " + numerosEntre0E100 + "números entre 0 e 100");
		System.out.println("Temos: " + numerosEntre101E200 + "números entre 101 e 200");
		System.out.println("Temos: " + numerosMaioresQue200 + "números maiores que 200");

	}

}
