package model;

public class Candidato {
	private int id;
	private String nomeCandidato;
	private String partidoCandidato;
	private String fichaLimpa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getPartidoCandidato() {
		return partidoCandidato;
	}
	public void setPartidoCandidato(String partidoCandidato) {
		this.partidoCandidato = partidoCandidato;
	}
	public String getFichaLimpa() {
		return fichaLimpa;
	}
	public void setFichaLimpa(String fichaLimpa) {
		this.fichaLimpa = fichaLimpa;
	}
	
	public String toString() {
		return this.id + " - " + this.nomeCandidato + " - " + this.partidoCandidato + " - " + this.fichaLimpa;
	}

};

