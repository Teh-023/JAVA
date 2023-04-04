package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		float media = (nota1 + nota2) / 2;
		
		if(media > 7.0) {
			JOptionPane.showMessageDialog(null,"Aluno aprovado!");
		}else 
			JOptionPane.showMessageDialog(null,"Aluno reprovado!");
		
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);


	}

}
