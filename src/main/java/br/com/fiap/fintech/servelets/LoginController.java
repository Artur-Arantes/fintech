package br.com.fiap.fintech.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.fintech.dto.LoginDto;
import br.com.fiap.fintech.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String email = request.getParameter("email");
		final String password = request.getParameter("password");

		LoginDto dto = new LoginDto();
		dto.setName(email);
		dto.setSenha(password);

		LoginService service = new LoginService();

		if (service.processaLogin(dto)) {
			response.sendRedirect(request.getContextPath() + "/home");
		}
		
		request.getRequestDispatcher("/WEB-INF/jsp/login_erro.jsp").forward(request, response);

	}

}
