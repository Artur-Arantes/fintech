package br.com.fiap.fintech.service;

import br.com.fiap.fintech.domain.Usuario;
import br.com.fiap.fintech.dto.LoginDto;
import br.com.fiap.fintech.repository.FactoryDAO;

public class LoginService {

	public boolean processaLogin(LoginDto dto) {
		if (!isDadosLoginValido(dto)) {
			return false;
		}
		FactoryDAO factory = new FactoryDAO();
		final Usuario usu = factory.getUsuarioDAO().select(convertToUsuario(dto));
		if (usu == null) {
			return false;
		}

		if (!usu.getSenha().equalsIgnoreCase(dto.getSenha())) {
			return false;
		}

		return true;
	}

	private boolean isDadosLoginValido(LoginDto dto) {
		if (dto.getName() == null || dto.getName().isBlank() || dto.getSenha() == null || dto.getSenha().isBlank()) {
			return false;
		}

		return true;
	}

	private Usuario convertToUsuario(LoginDto dto) {
		Usuario usu = new Usuario();
		usu.setEmail(dto.getName());
		usu.setSenha(dto.getSenha());
		return usu;
	}

}
