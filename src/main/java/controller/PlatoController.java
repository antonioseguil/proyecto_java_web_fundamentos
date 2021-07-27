package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bd.PlatoBd;
import data.PlatoData;

/**
 * Servlet implementation class PlatoController
 */
@WebServlet("/PlatoController")
public class PlatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PlatoBd platobd;
	private PlatoData platoDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlatoController() {
		super();
		platobd = new PlatoBd();
		platoDao = new PlatoData();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		platoDao.getPlatos();		
//		PrintWriter out = response.getWriter();
//		response.setContentType("application/json");
//		response.setCharacterEncoding("UTF-8");
//		out.print("");
//		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
