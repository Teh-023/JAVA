package Lista2_OO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pais {
	
	private static final String fronteiras = null;
	private String ISO;
	private String nome;
	private double qtdePopulacao;
	private double dimensao;
		
	
	public Pais(String ISO, String nome, double qtdePopulacao, double dimensao) {
		this.nome = nome;
		this.ISO= ISO;
		this.qtdePopulacao = qtdePopulacao;
		this.dimensao = dimensao;
	}
	public String getISO() {
		return ISO;
	}
	public void setISO(String iSO) {
		ISO = iSO;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQtdePopulacao() {
		return qtdePopulacao;
	}
	public void setQtdePopulacao(double qtdePopulacao) {
		this.qtdePopulacao = qtdePopulacao;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public boolean equals(Pais paisIgual) {
		return this.ISO.equals(paisIgual.getISO());
	}
	public boolean paisesFronteira(CharSequence paisIgual) {
		return this.fronteiras.contains(paisIgual);
	}
	
	public double getDensidadePopulacao() {
		return this.qtdePopulacao / dimensao;
	}
		
		
	}
	
