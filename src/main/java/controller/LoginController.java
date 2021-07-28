package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bd.UsuarioBd;
import data.UsuarioData;
import model.Usuario;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(description = "controlador para la vista login.", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioData usuarioDao = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
        new UsuarioBd();
        usuarioDao = new UsuarioData();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("txtUsuario");
		String password = request.getParameter("txtPassword");
		Usuario loginUsuario = usuarioDao.loginUsuario(usuario, password);
		HttpSession sesionLogin = request.getSession(true);
		if(loginUsuario == null) {
			request.setAttribute("error", "1");
			sesionLogin.setAttribute("estado","false");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			sesionLogin.setAttribute("usuario", loginUsuario);
			sesionLogin.setAttribute("tipoUsuario", loginUsuario.getTipoUsuario());
			sesionLogin.setAttribute("estado","true");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}