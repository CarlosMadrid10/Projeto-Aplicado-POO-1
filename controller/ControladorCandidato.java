package controller;

import java.util.List;

import dao.CandidatoDao;
import model.Candidato;


public class ControladorCandidato {
	
	public void salvar(Candidato candidato) throws Exception {
		if (candidato.getNomeCandidato() == null || candidato.getNomeCandidato().length() <= 3) {
			throw new Exception("Candidato inválido");
		}
		CandidatoDao.getInstance().salvar(candidato);

	}
	
	public void atualizar(Candidato candidato) throws Exception {
		if (candidato.getNomeCandidato() == null || candidato.getNomeCandidato().length() <= 3) {
			throw new Exception("Candidato inválido");
		}
		CandidatoDao.getInstance().salvar(candidato);
	}
	
	public void excluir(int idCandidato) throws Exception {
		if (idCandidato == 0) {
			throw new Exception("Não há candidatos a serem excluídos.");
		}
		CandidatoDao.getInstance().excluir(idCandidato);
	}
	
	public List <Candidato> listar () {
		return CandidatoDao.getInstance().listar();
	}
}
