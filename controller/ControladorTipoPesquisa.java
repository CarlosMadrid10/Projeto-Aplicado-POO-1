package controller;

import java.util.List;
import dao.TipoPesquisaDao;
import model.TipoPesquisa;

public class ControladorTipoPesquisa {
	public void salvar(TipoPesquisa tipoPesquisa) throws Exception {
		if (tipoPesquisa.getId() < 0) {
			throw new Exception("Erro inesperado com o id.");
		}
		TipoPesquisaDao.getInstance().salvar(tipoPesquisa);

	}
	
	public void atualizar(TipoPesquisa tipoPesquisa) throws Exception {
		if (tipoPesquisa.getId() <= 0) {
			throw new Exception("Erro inesperado com o id.");
		}
		TipoPesquisaDao.getInstance().salvar(tipoPesquisa);
	}
	
	public void excluir(int idTipoPesquisa) throws Exception {
		if (idTipoPesquisa == 0) {
			throw new Exception("Não há pesquisas a serem excluídas.");
		}
		TipoPesquisaDao.getInstance().excluir(idTipoPesquisa);
	}
	
	public List <TipoPesquisa> listar () {
		return TipoPesquisaDao.getInstance().listar();
	}
}
