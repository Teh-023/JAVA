package Lista2_OO;

public class Contaespecial extends Contacorrente {
	
	private float limite;
	
	public Contaespecial(String nome, float saldo, int conta, float valorDeposito, int valorSaque, float limite) {
		super(nome, saldo, conta, valorDeposito, valorSaque);
		this.limite = limite;
		
		
		boolean saque(double valor){
			if(valor <=(getSaldo() + limite)) {
				setSaldo(getSaldo() - valor);
			}
		}
	}
	

}