package curso;

import javax.swing.JOptionPane;

public class MetodoReplace {

	public static void main(String[] args) {
		String frase = "O cachorro faz auau, o gato miau e a galinha cocó ";
		//String fraseComSubstituicao = frase.replace("cachorro", "lobo");
		String procurado = JOptionPane.showInputDialog(null, "Digite o valor procurado: ");
		String aSubstituir = JOptionPane.showInputDialog(null, "Digite o valor a substituir: ");
		String fraseComSubstituicao = frase.replace(procurado, aSubstituir);
		
		System.out.println("Frase: " + frase);
		System.out.println("Frase com a troca: " + fraseComSubstituicao);
		

	}

}
