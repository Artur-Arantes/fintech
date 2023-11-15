package br.com.fiap.fintech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.fintech.domain.Comprovante;
import br.com.fiap.fintech.repository.FactoryDAO;

public class Main {
    public static void main(String[] args) {
    	final String DB_URL = "jdbc:oracle:thin:@localhost:49161:XE";
        final String DB_USER = "system";
        final String DB_PASSWORD = "oracle"; 

        Connection connection = null;

        	Comprovante comprovante = new Comprovante("", false);
        	comprovante.setId(1);
        	
        	FactoryDAO dao = new FactoryDAO();
        	dao.getComprovante().insert(comprovante);
        	comprovante.setId(2);
        	dao.getComprovante().insert(comprovante);
        	comprovante.setId(3);
        	dao.getComprovante().insert(comprovante);
        	comprovante.setId(4);
        	dao.getComprovante().insert(comprovante);
        	comprovante.setId(5);
        	dao.getComprovante().insert(comprovante);
        	List<Comprovante> comprovantes = dao.getComprovante().getAll();
        	
    }
    
    
}
