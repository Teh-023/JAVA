package OrientacaoObjetos;

public class Carro {
	
	String modelo;
	String fabricante;
	String cor;
	int qtdePortas;
	int potenciaCavalos;
	double velocidadeMaxima;
	int qtdeMarchas;
	boolean temArCondicionado;
	boolean estaLigado = false;

	public void ligar(boolean estaLigado) {
		if(estaLigado == false) {
			this.estaLigado = true;
		}
			
	}
	
	public void desliga(boolean estaLigado) {
		if(estaLigado) {
			this.estaLigado = false;
		}
	}
}
