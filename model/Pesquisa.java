package model;

public class Pesquisa {
	private int id;
	private String instituto;
	private String data;
	private String localVoto;
	private double mediaIdade;
	
	public Pesquisa tipoPesquisa;
	
	private String descricao = tipoPesquisa.descricao;
	private String tipo = tipoPesquisa.tipo;
	private String formato = tipoPesquisa.formato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocalVoto() {
		return localVoto;
	}
	public void setLocalVoto(String localVoto) {
		this.localVoto = localVoto;
	}
	public double getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(double mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public Pesquisa getTipoPesquisa() {
		return tipoPesquisa;
	}
	public void setTipoPesquisa(Pesquisa tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
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
	

	
	
	
}
