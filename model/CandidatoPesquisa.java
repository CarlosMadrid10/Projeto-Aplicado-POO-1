package model;

public class CandidatoPesquisa {
	private int id;
	private int votos;
	
	Pesquisa relPesquisa;
	Candidato relCandidato;
	TipoPesquisa relTipoPesquisa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
