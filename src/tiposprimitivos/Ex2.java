package tiposprimitivos;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		/*  2 - Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros. 
		 * O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
		 * O segundo valor corresponde à quantidade de pontos do time lanterna. 
		 * Considerando que cada vitória vale 3 pontos, 
		 * elabore uma classe que calcule o número de vitórias necessárias para que o time lanterna alcance (ou ultrapasse) o líder. 
		 * Por exemplo, supondo que as quantidades de ponto fornecidas sejam
		40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois (40-22) / 3 = 6. */
		
int qtdePontosLider = 0;
int qtdePontosLanterna = 0;

 Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pontos que o time possui: "));
		int pontoNecessario = qtdePontosLider - qtdePontosLanterna / 3;
		
		JOptionPane.showMessageDialog(null, "O seu time precisa de : " + pontoNecessario + "pontos para ganhar. ");
		
	

	}

}
