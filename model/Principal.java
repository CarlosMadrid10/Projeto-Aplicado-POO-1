package model;

import controller.ControladorCandidato;


public class Principal {
	public static void main(String[] args){
		
		Candidato c1 = new Candidato();
		c1.setId(1);
		c1.setNomeCandidato("João Cabeleira");
		c1.setPartidoCandidato("Barbeiro nunca");
		c1.setFichaLimpa("Não pode se candidatar");
		
		ControladorCandidato controlador = new ControladorCandidato();
		
		try {
			controlador.salvar(c1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Candidato c : controlador.listar()) {
			System.out.println(c.toString());
		}
		
		
		controlador.listar();
	}
};

