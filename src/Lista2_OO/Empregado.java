package Lista2_OO;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private int cpf;
	private int Idade;
	
	public Empregado(String nome, String endereco, String telefone) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.cpf = cpf;
		this.Idade = Idade;
	}

	public Empregado(String string, int i, String string2, int j, double d, int k) {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public int getCpf(int cpf) {
		return this.cpf = cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return this.Idade = Idade;
	}
	
	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	
	public double calcularSalario() {
        return salarioBase * (1 - imposto/100);
}

	public String getcpf() {
		// TODO Auto-generated method stub
		return null;
	}

	}

