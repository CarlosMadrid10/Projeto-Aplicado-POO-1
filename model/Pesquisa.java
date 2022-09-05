package model;

public class Pesquisa {
	private int id;
	private String instituto;
	private String data;
	private String localVoto;
	private double mediaIdade;
	
	TipoPesquisa Pesquisa;
	

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
	
}
