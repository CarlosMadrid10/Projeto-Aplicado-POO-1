package controller;

import dao.CandidatoPesquisaDao;
import model.CandidatoPesquisa;

public class ControladorCandidatoPesquisa {
	
	public void registrarVotos(CandidatoPesquisa candidatopesquisa) {
		
	}

	public void atualizar(CandidatoPesquisa candidatoPesquisa) throws Exception {
		if (candidatoPesquisa.getVotos() < 0) {
			throw new Exception("Número de votos inválido.");
		}
		CandidatoPesquisaDao.getInstance().registrarVotos(candidatoPesquisa);
	}
	
}
