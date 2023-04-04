package Lista2_OO;

public class Operario extends Empregado {
	

	public String ajudaDeCusto;
	private double valorProducao;
    private double comissao;

	public Operario(String nome, String endereco, String telefone, String ajudaDeCusto, double salarioBase, double imposto, double valorProducao ) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public String getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        salario += valorProducao * (comissao / 100);
        return salario;
}
}