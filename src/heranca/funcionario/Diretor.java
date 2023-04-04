package heranca.funcionario;

public class Diretor extends Funcionario {
	
	private static final double salario = 0;
	private int qtdeSubordinados;
	private String acessoPlanilhaGerencia;
		
		
	public Diretor(String nome, String cpf, double salario,String acessoPlanilhaGerencia) {
			super(nome, cpf, salario);
			this.qtdeSubordinados = qtdeSubordinados;
			this.acessoPlanilhaGerencia = acessoPlanilhaGerencia;
		}


	public int getQtdeSubordinados() {
		return qtdeSubordinados;
	}


	public void setQtdeSubordinados(int qtdeSubordinados) {
		this.qtdeSubordinados = qtdeSubordinados;
	}


	public String getAcessoPlanilhaGerencia() {
		return acessoPlanilhaGerencia;
	}


	public void setAcessoPlanilhaGerencia(String acessoPlanilhaGerencia) {
		this.acessoPlanilhaGerencia = acessoPlanilhaGerencia;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
}

