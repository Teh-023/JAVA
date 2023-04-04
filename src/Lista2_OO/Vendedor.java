package Lista2_OO;

public class Vendedor extends Empregado {
	
	private double valorVendas;
    private double comissao;
    

	public Vendedor(String nome, String endereco, String telefone,String string, double imposto, double valorVendas, double comissao) {
		super(nome,endereco,telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}


	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
		
	@Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double salarioFinal = salarioBase + (valorVendas * (comissao/100));
        return salarioFinal;
	}
}
