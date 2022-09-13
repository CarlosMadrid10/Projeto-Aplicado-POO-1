package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Pesquisa;
import util.ConnectionUtil;

public class PesquisaDao{
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	public Connection con = ConnectionUtil.getConnection();
	
	public static PesquisaDao getInstance() {
		if (instance == null) {
			instance = new PesquisaDao();
		}
		return instance;
		
	};
	
	
	public void salvar(Pesquisa pesquisa) {
		try {
			String sql = "insert into candidato(instituto, data_pesquisa, local_pesquisa, media_idade, descricao, tipo, formato) values (?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pesquisa.getInstituto());
			pstmt.setString(2, pesquisa.getData());
			pstmt.setString(3, pesquisa.getLocalVoto());
			pstmt.setDouble(4, pesquisa.getMediaIdade());
			pstmt.setString(5, pesquisa.getDescricao());
			pstmt.setString(6, pesquisa.getTipo());
			pstmt.setString(7, pesquisa.getFormato());
			pstmt.execute();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void atualizar(Pesquisa pesquisa) {
		listaPesquisa.set(pesquisa.getId(), pesquisa);
	}
	
	public void excluir(int idPesquisa) {
		listaPesquisa.remove(idPesquisa);
	}
	
	public List <Pesquisa> listar () {
		return null;
	}
}
