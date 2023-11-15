package br.com.fiap.fintech.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.fintech.dto.CadastroDto;
import br.com.fiap.fintech.service.CadastroService;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/cadastro")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.getRequestDispatcher("/WEB-INF/jsp/cadastro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String name = request.getParameter("fullName");
        final String password = request.getParameter("password");
        final String email = request.getParameter("email");
        final String tel = request.getParameter("phone");
        
        CadastroDto cadastro = new CadastroDto();
        cadastro.setName(name);
        cadastro.setPassword(password);
        cadastro.setEmail(email);
        cadastro.setCel(tel);
        
         CadastroService service = new CadastroService();
        service.cadastrarUsuario(cadastro);
        
        if(name != null && password != null && name.isEmpty() || password.isEmpty()) {
        	response.sendError(response.SC_BAD_REQUEST);
        }
        
        response.sendRedirect(request.getContextPath() + "/home");    }

}
