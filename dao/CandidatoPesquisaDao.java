package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import util.ConnectionUtil;

import model.CandidatoPesquisa;

public class CandidatoPesquisaDao{
	
	private static CandidatoPesquisaDao instance;
	public Connection con = ConnectionUtil.getConnection();
	
	public static CandidatoPesquisaDao getInstance() {
		if (instance == null) {
			instance = new CandidatoPesquisaDao();
		}
		return instance;
		
	};
	
	public void registrarVotos(CandidatoPesquisa candidatoPesquisa) {
		try {
			String sql = "insert into candidato_pesquisa(votos) values (?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, candidatoPesquisa.getVotos());
			pstmt.execute();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
}
