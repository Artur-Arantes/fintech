package br.com.fiap.fintech.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.fintech.repository.DAO.ComprovanteDAO;
import br.com.fiap.fintech.repository.DAO.UsuarioDAO;
import br.com.fiap.fintech.repository.jdbcDAO.ComprovanteJDBCDAO;
import br.com.fiap.fintech.repository.jdbcDAO.UsuarioJDBCDAO;

public class FactoryDAO {
	
public static Connection conn;
final static String DB_URL = "jdbc:oracle:thin:@localhost:49161:XE";
final static  String DB_USER = "system";
final static  String DB_PASSWORD = "oracle"; 

public FactoryDAO() {
	getConn();
}

public static Connection getConn() {
	try {
		return FactoryDAO.conn =  DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}

public ComprovanteDAO getComprovante() {
	return new ComprovanteJDBCDAO(getConn());
}

public UsuarioDAO getUsuarioDAO() {
	return new UsuarioJDBCDAO(getConn());
}


}
