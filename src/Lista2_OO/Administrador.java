package Lista2_OO;

public class Administrador extends Empregado {
	
	public static final String getcodigoSetor = null;
	private String nome;
	private double ajudaDeCusto;
	public String codigoSetor;
	
	public Administrador(String nome, String endereco, String telefone,String codigoSetor, double salarioBase, double imposto,double ajudaDeCusto) {
          super(nome, endereco, telefone);
             this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}



	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}



	@Override
    public double calcularSalario() {
        double salarioLiquido = super.calcularSalario() + ajudaDeCusto;
        return salarioLiquido;
	

}
}