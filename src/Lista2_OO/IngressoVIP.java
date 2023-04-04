package Lista2_OO;

public class IngressoVIP extends Ingresso {
	
	private double valorAdicional;
	
	public IngressoVIP(double valor, int codigo, int data, double valorAdicional) {
		super(valor, codigo, valorAdicional);
		this.valorAdicional = valorAdicional;
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	

	public double getValor() {
		return getValorAdicional();
	}

}
