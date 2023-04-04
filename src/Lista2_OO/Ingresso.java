package Lista2_OO;

public class Ingresso {

	/*Crie uma classe chamada Ingresso que possua um atributo valor e um método
	toString que retorne à informação do valor do ingresso.
	a. Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo valor
	Adicional. O método toString da classe IngressoVIP deve considerar que o valor do
	ingresso é o valor da superclasse somado ao valor Adicional do IngressoVIP.
	b. Crie uma classe para testar os objetos das classes Ingresso e IngressoVIP.*/
		
	
		    private double valor;
		    private int codigo;
		    private int data;

		    public Ingresso(double valor, int codigo, double valorAdicional) {
		        this.valor = valor;
		    }

			public double getValor() {
				return valor;
			}

			public void setValor(double valor) {
				this.valor = valor;
			}

			public int getCodigo() {
				return codigo;
			}

			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}

			public int getData() {
				return data;
			}

			public void setData(int data) {
				this.data = data;
			}

			public String toString() {
				return "O valor do ingresso é: R$" + valor;
		   
		    }
		}

