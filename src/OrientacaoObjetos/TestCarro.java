package OrientacaoObjetos;

import javax.swing.JOptionPane;

public class TestCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.modelo = "Corolla 2000 XEI";
		carro.fabricante = "Toyota";
		carro.cor = "Prata";
		carro.potenciaCavalos = 142;
		carro.qtdeMarchas = 4;
		carro.qtdePortas = 4;
		carro.temArCondicionado = true;
		
		System.out.println("Está ligado? " + carro.estaLigado);
		
		carro.ligar(false);
		
		System.out.println("Está ligado? " + carro.estaLigado);
		
		JOptionPane.showMessageDialog(null, carro.toString());
		System.out.println(carro.toString());

	
	}

}
