package br.cnj.projeto.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cnj.projeto.dao.CasoJudicialDAO;
import br.cnj.projeto.model.CasoJudicial;

import java.util.Arrays;
import java.util.ArrayList;

@Service
public class CasoJudicialService {

	private final CasoJudicialDAO casoJudicialDAO;
	
	public CasoJudicialService(CasoJudicialDAO casoJudicialDAO) {
		this.casoJudicialDAO = casoJudicialDAO;
	}



	public List<CasoJudicial> consultaTodosOsCasos(){
		return casoJudicialDAO.findAll();
	}
	
	public CasoJudicial pegarCasoPorId(int id) {
		return casoJudicialDAO.findByID(id);
	}
	
	public void criarNovoCaso(CasoJudicial caso) {
		casoJudicialDAO.save(caso);
	}



	public CasoJudicial atualizarCaso(int id, CasoJudicial casoAtualizado) {
		casoJudicialDAO.update(casoAtualizado);
		return casoAtualizado;
	}



	public void deletarCaso(int id) {
		casoJudicialDAO.delete(id);
		
	}



	



}
