package Lista_Condicionais;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		int distanciaPercorrer = Integer.parseInt(JOptionPane.showInputDialog("Digite uma distância em KM que você deseja percorrer: "));
		double valorPassagem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da passagem: "));
		
		double precoPassagem200KM = valorPassagem * 0.50;
		double distanciaMaisLonga = valorPassagem * 0.45;
		
				
				if(distanciaPercorrer == 200) {
					JOptionPane.showMessageDialog(null,"O preço da passagem é de: R$ " + precoPassagem200KM + " ,00");
				}else if (distanciaPercorrer > 200) {
					JOptionPane.showMessageDialog(null, "O preço da passagem é de:R$ " + distanciaMaisLonga + " ,00");
				}else {
					
				}
	}

}
