package br.com.fiap.fintech.repository.jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.fintech.domain.Usuario;
import br.com.fiap.fintech.repository.FactoryDAO;
import br.com.fiap.fintech.repository.DAO.UsuarioDAO;

public class UsuarioJDBCDAO implements UsuarioDAO {

	private Connection conn;
	private final String USUARIO_INSERT = "INSERT INTO USUARIO (email, nome, senha, cre_nao_exp, acc_nao_loc) VALUES (?, ?, ?, ? , ?)";
	private final String USUARIO_SELECT = "SELECT * FROM USUARIO WHERE email = ?";

	public UsuarioJDBCDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Usuario usuario) {
		try {
			int i = 1;
			PreparedStatement stmt = conn.prepareStatement(USUARIO_INSERT);
			stmt.setString(i++, usuario.getEmail());
			stmt.setString(i++, usuario.getNome());
			stmt.setString(i++, usuario.getSenha());
			stmt.setBoolean(i++, usuario.isContaBloqueada());
			stmt.setBoolean(i, usuario.isContaExpirada());

			stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delet(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario select(Usuario usuario) {
		try {
			int i = 1;
			PreparedStatement stmt = conn.prepareStatement(USUARIO_SELECT);
			stmt.setString(i++, usuario.getEmail());
			stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
