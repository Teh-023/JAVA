package Lista_Repetição;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
String nome = JOptionPane.showInputDialog("Insira seu nome");
int qtdeVezes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes quer seu nome na tela: "));

		
		for(int i = 0; i < qtdeVezes; i++) {
			System.out.println("Nome: " + nome);
	}
  }
}
