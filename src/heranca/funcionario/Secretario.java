package heranca.funcionario;

public class Secretario extends Funcionario {
	
	private static final double salario = 0;
	private String agenda;
	private String acessoEmailGerente;
		
		public Secretario(String nome, String cpf, double salario,String agenda) {
			super(nome, cpf,salario);
			this.agenda = agenda;
			this.acessoEmailGerente = acessoEmailGerente;

		}

		public String getAgenda() {
			return agenda;
		}

		public void setAgenda(String agenda) {
			this.agenda = agenda;
		}

		public String getAcessoEmailGerente() {
			return acessoEmailGerente;
		}

		public void setAcessoEmailGerente(String acessoEmailGerente) {
			this.acessoEmailGerente = acessoEmailGerente;
		}
		
		public double getBonificacao() {
			return this.salario * 0.10;
}
}
