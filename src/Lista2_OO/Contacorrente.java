package Lista2_OO;

public class Contacorrente extends Cliente {

	private float saldo;
	private int conta;
	private float valorDeposito;
	private float valorSaque;
	
	public Contacorrente(String nome, float saldo, int conta,float valorDeposito, float valorSaque) {
		super(nome);
		this.conta = conta;
		this.saldo = saldo;
		this.valorDeposito = valorDeposito;
		this.valorSaque = valorSaque;
	}
		
	
	      public void deposito(float valor) {
	    	  this.saldo += valor;
	      }
		boolean saque(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				
				return true;
			}else {
				return false;
			}
	
		}
		
	}
	
	


