package br.cnj.projeto.dao;

import java.util.List;

import br.cnj.projeto.model.CasoJudicial;

public interface CasoJudicialDAO {
	List<CasoJudicial> findAll();
	CasoJudicial findByID(int id);
	List<CasoJudicial> findAll(int page, int pageSize, String sortBy, String sortOrder);
	void save(CasoJudicial casoJudicial);
	void update(CasoJudicial casoJudicial);
	void delete(int id);
}
