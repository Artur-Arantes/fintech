package br.com.fiap.fintech.repository.DAO;

import java.util.List;

import br.com.fiap.fintech.domain.Comprovante;
import br.com.fiap.fintech.domain.Usuario;

public interface UsuarioDAO {


		public void insert(Usuario usuario);

		public void update(Usuario usuario);

		public List<Usuario> getAll();

		public void delet(Usuario usuario);
		
		public Usuario select(Usuario usuario);
	
}