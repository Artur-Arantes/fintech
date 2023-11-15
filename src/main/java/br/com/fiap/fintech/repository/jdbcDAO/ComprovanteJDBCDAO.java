package br.com.fiap.fintech.repository.jdbcDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.fintech.domain.Comprovante;
import br.com.fiap.fintech.repository.DAO.ComprovanteDAO;

public class ComprovanteJDBCDAO implements ComprovanteDAO {
	private Connection conn;
	private final String COMPROVANTE_INSERT = "INSERT INTO COMPROVANTE (id_comprovante, id_usuario, nome_arquivo, dt_upload) VALUES (?, ?, ?, ?)"; 
	private final String COMPROVANTE_UPDATE = "UPDATE COMPROVANTE set nome_arquivo = ? AND incluir = ? WHERE id = ?"; 
	private final String COMPROVANTE_DELET= "DELETE FROM COMPROVANTE WHERE id = ?"; 
	private final String COMPROVANTE_GETALL= "SELECT * FROM COMPROVANTE"; 


	
	public ComprovanteJDBCDAO(Connection conn) {
		this.conn = conn;
	}

	public void insert(Comprovante comprovante) {
		try {
			
			PreparedStatement stmt = conn.prepareStatement(COMPROVANTE_INSERT);
			stmt.setInt(1, comprovante.getId());
			stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Comprovante comprovante) {

	}

	public List<Comprovante> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delet(Comprovante comprovante) {
		// TODO Auto-generated method stub

	}

}
