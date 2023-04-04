package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento: "));
		
		int dif = anoAtual - anoNascimento;
		
				
				if (dif > 18){
					JOptionPane.showMessageDialog(null, "Você já se alistou? Passaram " + "anos");
				}else if (dif ==18) {
					JOptionPane.showMessageDialog(null, "Esse é o ano de você se alistar!");
				}else {
					
				}
		
		
	}
}
