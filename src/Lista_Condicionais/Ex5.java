package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
 
		
		if (ano%4 == 0){
			JOptionPane.showMessageDialog(null, "O Ano digitado é BISSEXTO");
		}else {
			JOptionPane.showMessageDialog(null, "O Ano digitado NÃO É BISSEXTO");
		
			
		}

	}

}
