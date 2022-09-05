package dao;

import model.TipoPesquisa;

import java.util.ArrayList;
import java.util.List;

public class TipoPesquisaDao {

	private static TipoPesquisaDao instance;
	private List<TipoPesquisa> listaTipoPesquisa = new ArrayList<>();
	
	public static TipoPesquisaDao getInstance() {
		if (instance == null) {
			instance = new TipoPesquisaDao();
		}
		return instance;
		
	};
	
	public void salvar(TipoPesquisa tipoPesquisa) {
		listaTipoPesquisa.add(tipoPesquisa);
	}
	
	public void atualizar(TipoPesquisa tipoPesquisa) {
		listaTipoPesquisa.set(tipoPesquisa.getId(), tipoPesquisa);
	}
	
	public void excluir(int idTipoPesquisa) {
		listaTipoPesquisa.remove(idTipoPesquisa);
	}
	
	public List <TipoPesquisa> listar () {
		return null;
	}
}
