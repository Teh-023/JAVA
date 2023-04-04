package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
int MaiorQue8 = 0;
		
		for(int i = 0; i < 5; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
			if(numero > 8) {
				MaiorQue8 ++;
				
			}
		}
		
		System.out.println("A quantidade de números maiores que 8 é: " + MaiorQue8);
		
	}

}

