package br.inatel.labs.labads.padraomvc.model.entidade;

public class Produto {
	
	private Long id;
	
	private String descricao;
	
	private Double preco;
	
	public Produto(Long id, String descricao, Double preco) {
		super();
		this.setId(id);
		this.setDescricao(descricao);
		this.setPreco(preco);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
}
