package ClassesAbstratas;

public class Automovel extends Veiculo {
	
	public void ligar() {
		
	}

	@Override
	public void acelerar() {
		setVelocidade(getVelocidade() + 100);
		
		
		
	}

}
