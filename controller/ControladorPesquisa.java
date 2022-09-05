package controller;

import java.util.List;

import dao.PesquisaDao;
import model.Pesquisa;


public class ControladorPesquisa {
	
	public void salvar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getId() < 0) {
			throw new Exception("Erro inesperado com o id.");
		}
		PesquisaDao.getInstance().salvar(pesquisa);

	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getId() <= 0) {
			throw new Exception("Erro inesperado com o id.");
		}
		PesquisaDao.getInstance().salvar(pesquisa);
	}
	
	public void excluir(int idPesquisa) throws Exception {
		if (idPesquisa == 0) {
			throw new Exception("Não há pesquisas a serem excluídas.");
		}
		PesquisaDao.getInstance().excluir(idPesquisa);
	}
	
	public List <Pesquisa> listar () {
		return PesquisaDao.getInstance().listar();
	}
}
