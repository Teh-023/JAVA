package Lista_1;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		float media = (nota1 + nota2) / 2;
		
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);


	}

}
