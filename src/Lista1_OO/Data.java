package Lista1_OO;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	
	public Data(int dia, int mes, int ano) {
		if(mes == 2) {
			if(dia > 29)
				throw new IllegalArgumentException("Os dias não podem ser maior que 29");
		}
		if(dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Digite um valor válido para a data entre 1 e 31");
			}
			this.dia = dia;
			
			if(mes < 1 || mes > 12) {
				throw new IllegalArgumentException("Digite um valor válido para o mes entre 1 e 12");
					
				}
				this.mes = mes;
				
				if(ano < 0)
					throw new IllegalArgumentException("Digite um valor válido para o ano!"); 
					this.ano = ano;
				}
	
	@Override
    public String toString() {
        return "Data{" + dia + "/" + mes + "/" + ano +'}';
    }

    public void avancarUmDia(){
        this.setDia(this.getDia() + 1);
    }



	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}


