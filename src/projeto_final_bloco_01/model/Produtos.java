package projeto_final_bloco_01.model;

import java.math.BigDecimal;

public abstract class Produtos {
	private int codigoproduto;
	private String nomeString;
	private String marcaString;
	private BigDecimal precoBigDecimal;

	public Produtos(int codigoproduto, String nomeString, String marcaString, BigDecimal precoBigDecimal) {
		this.codigoproduto = codigoproduto;
		this.nomeString = nomeString;
		this.marcaString = marcaString;
		this.precoBigDecimal = precoBigDecimal;
	}

	public int getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public String getMarcaString() {
		return marcaString;
	}

	public void setMarcaString(String marcaString) {
		this.marcaString = marcaString;
	}

	public BigDecimal getPrecoBigDecimal() {
		return precoBigDecimal;
	}

	public void setPrecoBigDecimal(BigDecimal precoBigDecimal) {
		this.precoBigDecimal = precoBigDecimal;
	}

	public void visualizar() {

		System.out.println("\n\n********************************");
		System.out.println("Dados do Produto");
		System.out.println("********************************");
		System.out.println("Codigo do Produto: " + this.codigoproduto);
		System.out.println("Nome: " + this.nomeString);
		System.out.println("Marca: " + this.marcaString);
		System.out.println("Preco: " + this.precoBigDecimal);

	}

}
