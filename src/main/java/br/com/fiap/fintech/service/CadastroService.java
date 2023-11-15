package br.com.fiap.fintech.service;

import br.com.fiap.fintech.domain.Usuario;
import br.com.fiap.fintech.dto.CadastroDto;
import br.com.fiap.fintech.repository.FactoryDAO;

public class CadastroService {

public boolean cadastrarUsuario(CadastroDto cadastroDto) {
	if(isDadosValidos(cadastroDto)) {
		FactoryDAO factory = new FactoryDAO();
		 factory.getUsuarioDAO().insert(convertToUsuario(cadastroDto));
		 return true;	
	}
	
	return false;
}

public boolean isDadosValidos(CadastroDto cadastroDto) {
	if(cadastroDto.getName().isEmpty() || cadastroDto.getPassword().isEmpty() || cadastroDto.getName().isBlank() ||
			cadastroDto.getPassword().isBlank()) {
		return false;
	}
	
	return true;
}


private Usuario convertToUsuario(CadastroDto cadastroDto) {
	Usuario usu = new Usuario();
	usu.setEmail(cadastroDto.getEmail());
	usu.setNome(cadastroDto.getName());
	usu.setSenha(cadastroDto.getPassword());
	usu.setContaBloqueada(false);
	usu.setContaExpirada(false);
	return usu;
}
	
}
