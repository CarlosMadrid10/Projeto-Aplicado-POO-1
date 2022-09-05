package dao;

import java.util.List;
import java.util.ArrayList;

import model.CandidatoPesquisa;

public class CandidatoPesquisaDao{
	
	private static CandidatoPesquisaDao instance;
	private List<CandidatoPesquisa> listaCandidatosPesquisa = new ArrayList<>();
	
	public static CandidatoPesquisaDao getInstance() {
		if (instance == null) {
			instance = new CandidatoPesquisaDao();
		}
		return instance;
		
	};
	
	public void registrarVotos(CandidatoPesquisa candidatoPesquisa) {
		listaCandidatosPesquisa.add(candidatoPesquisa);
	}

};