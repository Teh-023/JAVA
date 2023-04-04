package Lista1_OO;

public class Invoice {
	
	private int itemFaturado;
	private String descricaoItem;
	private int qtdeComprada;
	private double precoUnidade;
	
	public Invoice(int itemFaturado, String descricaoItem, int qtdeComprada, String string) {
		this.itemFaturado = itemFaturado;
		this.descricaoItem = descricaoItem;
		if(qtdeComprada < 0)
			this.qtdeComprada = 0;
		else this.qtdeComprada = qtdeComprada;
		if(precoUnidade < 0) 
			this.precoUnidade = 0.0;
		else this.precoUnidade = precoUnidade;
	}

	public int getItemFaturado() {
		return itemFaturado;
	}

	public void setItemFaturado(int itemFaturado) {
		this.itemFaturado = itemFaturado;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQtdeComprada() {
		return qtdeComprada;
	}

	public void setQtdeComprada(int qtdeComprada) {
		this.qtdeComprada = qtdeComprada;
	}

	public double getPrecoUnidade() {
		return precoUnidade;
	}

	public void setPrecoUnidade(double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
	public double GetInvoiceAmount() {
		double total = qtdeComprada * precoUnidade;
		return total;
	}
	  }


