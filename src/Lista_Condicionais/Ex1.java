package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		double velocidadeVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Digite sua velocidade: "));
		
		if(velocidadeVeiculo > 80.0) {
			JOptionPane.showMessageDialog(null, "Você foi multado!");
			
		double valorMulta = (velocidadeVeiculo - 80.0) * 5.0;
		
		JOptionPane.showMessageDialog(null, "Sua velocidade: " + velocidadeVeiculo + "KM/H");
		JOptionPane.showMessageDialog(null, "Sua multa foi de: R$" + valorMulta + " ,00");
		}
	}

}
