package br.com.fiap.fintech.repository.DAO;

import java.util.List;

import br.com.fiap.fintech.domain.Comprovante;

public interface ComprovanteDAO {

public void insert(Comprovante comprovante);

public void update(Comprovante comprovante);

public List<Comprovante> getAll();

public void delet(Comprovante comprovante);


}
