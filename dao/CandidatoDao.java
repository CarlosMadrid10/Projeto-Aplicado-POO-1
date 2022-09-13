package dao;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Candidato;
import util.ConnectionUtil;

public class CandidatoDao{
	
	public static CandidatoDao instance;
	public List<Candidato> listaCandidatos = new ArrayList<>();
	public Connection con = ConnectionUtil.getConnection();
	
	public static CandidatoDao getInstance() {
		if (instance == null) {
			instance = new CandidatoDao();
		}
		return instance;
		
	};
	
	public void salvar(Candidato candidato) {
		try {
			String sql = "insert into candidato(nome, partido, ficha-limpa) values (?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, candidato.getNomeCandidato());
			pstmt.setString(2, candidato.getPartidoCandidato());
			pstmt.setString(3, candidato.getFichaLimpa());
			pstmt.execute();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void atualizar(Candidato candidato) {
		try {
			String sql = "update candidato set nome = ?, partido = ?, ficha_limpa = ? where id_candidato = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, candidato.getNomeCandidato());
			pstmt.setString(2, candidato.getPartidoCandidato());
			pstmt.setString(3, candidato.getFichaLimpa());
			pstmt.setInt(4, candidato.getId());
			pstmt.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(int idCandidato) {
		try {
			String sql = "delete from candidato where id_candidato = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(4, idCandidato);
			pstmt.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public List <Candidato> listar () {
		List<Candidato> listaCandidatos = new ArrayList<>();
		try {
			String sql = "select * from cliente";
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato();
				c.setId(rs.getInt("id_candidato"));
				c.setNomeCandidato(rs.getString("nome"));;
				c.setPartidoCandidato(rs.getString("partido"));
				c.setFichaLimpa(rs.getString("ficha_limpa"));
				listaCandidatos.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCandidatos;
		}
	}
