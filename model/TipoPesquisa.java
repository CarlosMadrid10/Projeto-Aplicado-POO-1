package model;

public class TipoPesquisa {
	private int id;
	private String descricao;
	private String tipo;
	private String formato;
	
	public int getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setId(int id) {
		this.id = id;
	}
	
};